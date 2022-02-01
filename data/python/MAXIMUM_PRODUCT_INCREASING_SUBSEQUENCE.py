# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    mpis = [ 0 ] * ( n )
    for i in range ( n ) :
        mpis [ i ] = arr [ i ]
    for i in range ( 1 , n ) :
        for j in range ( i ) :
            if ( arr [ i ] > arr [ j ] and mpis [ i ] < ( mpis [ j ] * arr [ i ] ) ) :
                mpis [ i ] = mpis [ j ] * arr [ i ]
    return max ( mpis )


#TOFILL
