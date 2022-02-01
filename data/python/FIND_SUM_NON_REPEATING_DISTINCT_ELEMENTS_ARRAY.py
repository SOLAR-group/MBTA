# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    s = set ( )
    sum = 0
    for i in range ( n ) :
        if arr [ i ] not in s :
            s.add ( arr [ i ] )
    for i in s :
        sum = sum + i
    return sum


#TOFILL
