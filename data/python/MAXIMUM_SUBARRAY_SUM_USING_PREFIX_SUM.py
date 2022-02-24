import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( arr , n ) :
    min_prefix_sum = 0
    res = - math.inf
    prefix_sum = [ ]
    prefix_sum.append ( arr [ 0 ] )
    for i in range ( 1 , n ) :
        prefix_sum.append ( prefix_sum [ i - 1 ] + arr [ i ] )
    for i in range ( n ) :
        res = max ( res , prefix_sum [ i ] - min_prefix_sum )
        min_prefix_sum = min ( min_prefix_sum , prefix_sum [ i ] )
    return res


#TOFILL
