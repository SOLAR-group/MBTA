# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( x , y ) :
    x = x % 10
    if y != 0 :
        y = y % 4 + 4
    return ( ( ( int ) ( math.pow ( x , y ) ) ) % 10 )


#TOFILL
