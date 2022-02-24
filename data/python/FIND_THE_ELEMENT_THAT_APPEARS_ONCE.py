import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    ones = 0
    twos = 0
    for i in range ( n ) :
        twos = twos | ( ones & arr [ i ] )
        ones = ones ^ arr [ i ]
        common_bit_mask = ~ ( ones & twos )
        ones &= common_bit_mask
        twos &= common_bit_mask
    return ones


#TOFILL
