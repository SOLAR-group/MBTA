# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( number ) :
    n = len ( number )
    d = [ 0 for i in range ( 9 ) ]
    d [ 0 ] = 1
    result = 0
    mod_sum = 0
    continuous_zero = 0
    for i in range ( n ) :
        if ( ord ( number [ i ] ) - ord ( '0' ) == 0 ) :
            continuous_zero += 1
        else :
            continuous_zero = 0
        mod_sum += ord ( number [ i ] ) - ord ( '0' )
        mod_sum %= 9
        result += d [ mod_sum ]
        d [ mod_sum ] += 1
        result -= continuous_zero
    return result


#TOFILL
