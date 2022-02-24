import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , n , k ) :
    if k >= n - 1 :
        return n
    best = 0
    times = 0
    for i in range ( n ) :
        if a [ i ] > best :
            best = a [ i ]
            if i == True :
                times = 1
        else :
            times += 1
        if times >= k :
            return best
    return best


#TOFILL
