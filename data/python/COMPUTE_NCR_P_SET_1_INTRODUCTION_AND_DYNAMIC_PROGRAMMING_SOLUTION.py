import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , r , p ) :
    C = [ 0 for i in range ( r + 1 ) ]
    C [ 0 ] = 1
    for i in range ( 1 , n + 1 ) :
        for j in range ( min ( i , r ) , 0 , - 1 ) :
            C [ j ] = ( C [ j ] + C [ j - 1 ] ) % p
    return C [ r ]


#TOFILL
