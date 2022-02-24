import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( start , end , arr ) :
    frequency = dict ( )
    for i in range ( start , end + 1 ) :
        if arr [ i ] in frequency.keys ( ) :
            frequency [ arr [ i ] ] += 1
        else :
            frequency [ arr [ i ] ] = 1
    count = 0
    for x in frequency :
        if x == frequency [ x ] :
            count += 1
    return count


#TOFILL
