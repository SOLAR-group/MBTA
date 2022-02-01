# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( A , B , m , n ) :
    dp = [ [ 0 for i in range ( m + 1 ) ] for j in range ( n + 1 ) ]
    for i in range ( 1 , n + 1 , 1 ) :
        for j in range ( i , m + 1 , 1 ) :
            dp [ i ] [ j ] = max ( ( dp [ i - 1 ] [ j - 1 ] + ( A [ j - 1 ] * B [ i - 1 ] ) ) , dp [ i ] [ j - 1 ] )
    return dp [ n ] [ m ]


#TOFILL
