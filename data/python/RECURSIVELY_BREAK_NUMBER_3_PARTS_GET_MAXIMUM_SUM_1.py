import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    dp = [ 0 ] * ( n + 1 )
    dp [ 0 ] = 0
    dp [ 1 ] = 1
    for i in range ( 2 , n + 1 ) :
        dp [ i ] = max ( dp [ int ( i / 2 ) ] + dp [ int ( i / 3 ) ] + dp [ int ( i / 4 ) ] , i ) ;
    return dp [ n ]


#TOFILL
