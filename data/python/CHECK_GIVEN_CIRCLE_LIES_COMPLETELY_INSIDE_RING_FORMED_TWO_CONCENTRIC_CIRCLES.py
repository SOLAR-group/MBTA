import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( r , R , r1 , x1 , y1 ) :
    dis = int ( math.sqrt ( x1 * x1 + y1 * y1 ) )
    return ( dis - r1 >= R and dis + r1 <= r )


#TOFILL
