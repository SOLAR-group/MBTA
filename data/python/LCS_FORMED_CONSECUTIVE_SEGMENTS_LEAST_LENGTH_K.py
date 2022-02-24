import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( k , s1 , s2 ) :
    n = len ( s1 )
    m = len ( s2 )
    lcs = [ [ 0 for x in range ( m + 1 ) ] for y in range ( n + 1 ) ]
    cnt = [ [ 0 for x in range ( m + 1 ) ] for y in range ( n + 1 ) ]
    for i in range ( 1 , n + 1 ) :
        for j in range ( 1 , m + 1 ) :
            lcs [ i ] [ j ] = max ( lcs [ i - 1 ] [ j ] , lcs [ i ] [ j - 1 ] )
            if ( s1 [ i - 1 ] == s2 [ j - 1 ] ) :
                cnt [ i ] [ j ] = cnt [ i - 1 ] [ j - 1 ] + 1 ;
            if ( cnt [ i ] [ j ] >= k ) :
                for a in range ( k , cnt [ i ] [ j ] + 1 ) :
                    lcs [ i ] [ j ] = max ( lcs [ i ] [ j ] , lcs [ i - a ] [ j - a ] + a )
    return lcs [ n ] [ m ]


#TOFILL
