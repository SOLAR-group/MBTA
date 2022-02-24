import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    dp = [ 1 for i in range ( n ) ]
    for i in range ( n ) :
        for j in range ( i ) :
            if ( ( arr [ i ] == arr [ j ] + 1 ) or ( arr [ i ] == arr [ j ] - 1 ) ) :
                dp [ i ] = max ( dp [ i ] , dp [ j ] + 1 )
    result = 1
    for i in range ( n ) :
        if ( result < dp [ i ] ) :
            result = dp [ i ]
    return result


#TOFILL
