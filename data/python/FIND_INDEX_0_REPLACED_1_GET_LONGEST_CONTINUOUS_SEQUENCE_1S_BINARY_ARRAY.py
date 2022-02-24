import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    max_count = 0
    max_index = 0
    prev_zero = - 1
    prev_prev_zero = - 1
    for curr in range ( n ) :
        if ( arr [ curr ] == 0 ) :
            if ( curr - prev_prev_zero > max_count ) :
                max_count = curr - prev_prev_zero
                max_index = prev_zero
            prev_prev_zero = prev_zero
            prev_zero = curr
    if ( n - prev_prev_zero > max_count ) :
        max_index = prev_zero
    return max_index


#TOFILL
