# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    jumps = [ 0 for i in range ( n ) ]
    if ( n == 0 ) or ( arr [ 0 ] == 0 ) :
        return float ( 'inf' )
    jumps [ 0 ] = 0
    for i in range ( 1 , n ) :
        jumps [ i ] = float ( 'inf' )
        for j in range ( i ) :
            if ( i <= j + arr [ j ] ) and ( jumps [ j ] != float ( 'inf' ) ) :
                jumps [ i ] = min ( jumps [ i ] , jumps [ j ] + 1 )
                break
    return jumps [ n - 1 ]


#TOFILL
