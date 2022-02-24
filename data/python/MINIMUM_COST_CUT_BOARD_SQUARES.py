import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( X , Y , m , n ) :
    res = 0
    X.sort ( reverse = True )
    Y.sort ( reverse = True )
    hzntl = 1 ; vert = 1
    i = 0 ; j = 0
    while ( i < m and j < n ) :
        if ( X [ i ] > Y [ j ] ) :
            res += X [ i ] * vert
            hzntl += 1
            i += 1
        else :
            res += Y [ j ] * hzntl
            vert += 1
            j += 1
    total = 0
    while ( i < m ) :
        total += X [ i ]
        i += 1
    res += total * vert
    total = 0
    while ( j < n ) :
        total += Y [ j ]
        j += 1
    res += total * hzntl
    return res


#TOFILL
