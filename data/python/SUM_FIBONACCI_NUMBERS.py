import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if ( n <= 0 ) :
        return 0
    fibo = [ 0 ] * ( n + 1 )
    fibo [ 1 ] = 1
    sm = fibo [ 0 ] + fibo [ 1 ]
    for i in range ( 2 , n + 1 ) :
        fibo [ i ] = fibo [ i - 1 ] + fibo [ i - 2 ]
        sm = sm + fibo [ i ]
    return sm


#TOFILL
