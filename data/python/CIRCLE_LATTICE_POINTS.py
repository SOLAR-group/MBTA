import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( r ) :
    if ( r <= 0 ) :
        return 0
    result = 4
    for x in range ( 1 , r ) :
        ySquare = r * r - x * x
        y = int ( math.sqrt ( ySquare ) )
        if ( y * y == ySquare ) :
            result += 4
    return result


#TOFILL
