# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , m ) :
    if ( n > m ) :
        return True
    DP = [ False for i in range ( m ) ]
    for i in range ( n ) :
        if ( DP [ 0 ] ) :
            return True
        temp = [ False for i in range ( m ) ]
        for j in range ( m ) :
            if ( DP [ j ] == True ) :
                if ( DP [ ( j + arr [ i ] ) % m ] == False ) :
                    temp [ ( j + arr [ i ] ) % m ] = True
        for j in range ( m ) :
            if ( temp [ j ] ) :
                DP [ j ] = True
        DP [ arr [ i ] % m ] = True
    return DP [ 0 ]


#TOFILL