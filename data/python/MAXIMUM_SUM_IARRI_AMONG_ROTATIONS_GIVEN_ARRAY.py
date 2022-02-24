import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import sys

def f_gold ( arr , n ) :
    res = - sys.maxsize
    for i in range ( 0 , n ) :
        curr_sum = 0
        for j in range ( 0 , n ) :
            index = int ( ( i + j ) % n )
            curr_sum += j * arr [ index ]
        res = max ( res , curr_sum )
    return res


#TOFILL
