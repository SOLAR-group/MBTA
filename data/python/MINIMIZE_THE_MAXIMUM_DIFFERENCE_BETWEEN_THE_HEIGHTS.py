import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , k ) :
    if ( n == 1 ) :
        return 0
    arr.sort ( )
    ans = arr [ n - 1 ] - arr [ 0 ]
    small = arr [ 0 ] + k
    big = arr [ n - 1 ] - k
    if ( small > big ) :
        small , big = big , small
    for i in range ( 1 , n - 1 ) :
        subtract = arr [ i ] - k
        add = arr [ i ] + k
        if ( subtract >= small or add <= big ) :
            continue
        if ( big - subtract <= add - small ) :
            small = subtract
        else :
            big = add
    return min ( ans , big - small )


#TOFILL
