import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , x ) :
    curr_sum = 0
    min_len = n + 1
    start = 0
    end = 0
    while ( end < n ) :
        while ( curr_sum <= x and end < n ) :
            curr_sum += arr [ end ]
            end += 1
        while ( curr_sum > x and start < n ) :
            if ( end - start < min_len ) :
                min_len = end - start
            curr_sum -= arr [ start ]
            start += 1
    return min_len


#TOFILL
