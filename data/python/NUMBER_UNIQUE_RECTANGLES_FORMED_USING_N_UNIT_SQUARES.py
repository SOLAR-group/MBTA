import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    ans = 0
    for length in range ( 1 , int ( math.sqrt ( n ) ) + 1 ) :
        height = length
        while ( height * length <= n ) :
            ans += 1
            height += 1
    return ans


#TOFILL
