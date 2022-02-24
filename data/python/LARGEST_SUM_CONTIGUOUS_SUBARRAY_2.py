import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , size ) :
    max_so_far = a [ 0 ]
    curr_max = a [ 0 ]
    for i in range ( 1 , size ) :
        curr_max = max ( a [ i ] , curr_max + a [ i ] )
        max_so_far = max ( max_so_far , curr_max )
    return max_so_far


#TOFILL
