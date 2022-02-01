# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    mp = { }
    maxDict = 0
    for i in range ( n ) :
        if arr [ i ] not in mp.keys ( ) :
            mp [ arr [ i ] ] = i
        else :
            maxDict = max ( maxDict , i - mp [ arr [ i ] ] )
    return maxDict


#TOFILL
