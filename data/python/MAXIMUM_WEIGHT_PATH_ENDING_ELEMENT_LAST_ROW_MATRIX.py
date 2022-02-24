import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( mat , N ) :
    dp = [ [ 0 for i in range ( N ) ] for j in range ( N ) ]
    dp [ 0 ] [ 0 ] = mat [ 0 ] [ 0 ]
    for i in range ( 1 , N ) :
        dp [ i ] [ 0 ] = mat [ i ] [ 0 ] + dp [ i - 1 ] [ 0 ]
    for i in range ( 1 , N ) :
        for j in range ( 1 , min ( i + 1 , N ) ) :
            dp [ i ] [ j ] = mat [ i ] [ j ] + \
                max ( dp [ i - 1 ] [ j - 1 ] , dp [ i - 1 ] [ j ] )
    result = 0
    for i in range ( N ) :
        if ( result < dp [ N - 1 ] [ i ] ) :
            result = dp [ N - 1 ] [ i ]
    return result


#TOFILL
