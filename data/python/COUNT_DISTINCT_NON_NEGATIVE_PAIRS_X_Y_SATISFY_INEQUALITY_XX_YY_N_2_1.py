import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    x = 0
    res = 0
    yCount = 0
    while ( yCount * yCount < n ) :
        yCount = yCount + 1
    while ( yCount != 0 ) :
        res = res + yCount
        x = x + 1
        while ( yCount != 0 and ( x * x + ( yCount - 1 ) * ( yCount - 1 ) >= n ) ) :
            yCount = yCount - 1
    return res


#TOFILL
