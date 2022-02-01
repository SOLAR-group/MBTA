# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import sys

def f_gold ( a , n ) :
    mn = sys.maxsize
    sum = 0
    for i in range ( n ) :
        mn = min ( a [ i ] , mn )
        sum += a [ i ]
    return mn * ( sum - mn )


#TOFILL
