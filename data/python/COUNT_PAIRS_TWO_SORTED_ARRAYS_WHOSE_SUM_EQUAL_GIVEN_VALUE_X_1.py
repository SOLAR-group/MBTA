import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr1 , arr2 , m , n , x ) :
    count = 0
    us = set ( )
    for i in range ( m ) :
        us.add ( arr1 [ i ] )
    for j in range ( n ) :
        if x - arr2 [ j ] in us :
            count += 1
    return count


#TOFILL
