# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    brr = [ 0 ] * ( 2 * n + 1 )
    for i in range ( n ) :
        brr [ i ] = arr [ i ]
    for i in range ( n ) :
        brr [ n + i ] = arr [ i ]
    maxHam = 0
    for i in range ( 1 , n ) :
        currHam = 0
        k = 0
        for j in range ( i , i + n ) :
            if brr [ j ] != arr [ k ] :
                currHam += 1
                k = k + 1
        if currHam == n :
            return n
        maxHam = max ( maxHam , currHam )
    return maxHam


#TOFILL
