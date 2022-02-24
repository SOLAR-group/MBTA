import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    m = len ( a )
    n = len ( b )
    lookup = [ [ 0 ] * ( n + 1 ) for i in range ( m + 1 ) ]
    for i in range ( n + 1 ) :
        lookup [ 0 ] [ i ] = 0
    for i in range ( m + 1 ) :
        lookup [ i ] [ 0 ] = 1
    for i in range ( 1 , m + 1 ) :
        for j in range ( 1 , n + 1 ) :
            if a [ i - 1 ] == b [ j - 1 ] :
                lookup [ i ] [ j ] = lookup [ i - 1 ] [ j - 1 ] + lookup [ i - 1 ] [ j ]
            else :
                lookup [ i ] [ j ] = lookup [ i - 1 ] [ j ]
    return lookup [ m ] [ n ]


#TOFILL
