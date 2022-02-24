import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( X , Y ) :
    m = len ( X )
    n = len ( Y )
    L = [ [ 0 for i in range ( n + 1 ) ] for j in range ( 2 ) ]
    bi = bool
    for i in range ( m ) :
        bi = i & 1
        for j in range ( n + 1 ) :
            if ( i == 0 or j == 0 ) :
                L [ bi ] [ j ] = 0
            elif ( X [ i ] == Y [ j - 1 ] ) :
                L [ bi ] [ j ] = L [ 1 - bi ] [ j - 1 ] + 1
            else :
                L [ bi ] [ j ] = max ( L [ 1 - bi ] [ j ] , L [ bi ] [ j - 1 ] )
    return L [ bi ] [ n ]


#TOFILL
