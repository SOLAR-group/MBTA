# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    jumps = [ 0 for i in range ( n ) ]
    for i in range ( n - 2 , - 1 , - 1 ) :
        if ( arr [ i ] == 0 ) :
            jumps [ i ] = float ( 'inf' )
        elif ( arr [ i ] >= n - i - 1 ) :
            jumps [ i ] = 1
        else :
            min = float ( 'inf' )
            for j in range ( i + 1 , n ) :
                if ( j <= arr [ i ] + i ) :
                    if ( min > jumps [ j ] ) :
                        min = jumps [ j ]
            if ( min != float ( 'inf' ) ) :
                jumps [ i ] = min + 1
            else :
                jumps [ i ] = min
    return jumps [ 0 ]


#TOFILL
