import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import sys

def f_gold ( arr , n , x , y ) :
    min_dist = sys.maxsize
    for i in range ( n ) :
        if arr [ i ] == x or arr [ i ] == y :
            prev = i
            break
    while i < n :
        if arr [ i ] == x or arr [ i ] == y :
            if arr [ prev ] != arr [ i ] and ( i - prev ) < min_dist :
                min_dist = i - prev
                prev = i
            else :
                prev = i
        i += 1
    return min_dist


#TOFILL
