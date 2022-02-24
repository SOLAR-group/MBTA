import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , n , k ) :
    max_so_far = - 2147483648
    max_ending_here = 0
    for i in range ( n * k ) :
        max_ending_here = max_ending_here + a [ i % n ]
        if ( max_so_far < max_ending_here ) :
            max_so_far = max_ending_here
        if ( max_ending_here < 0 ) :
            max_ending_here = 0
    return max_so_far


#TOFILL
