import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    leftMax = [ None ] * n
    leftMax [ 0 ] = float ( '-inf' )
    for i in range ( 1 , n ) :
        leftMax [ i ] = max ( leftMax [ i - 1 ] , arr [ i - 1 ] )
    rightMin = float ( 'inf' )
    for i in range ( n - 1 , - 1 , - 1 ) :
        if leftMax [ i ] < arr [ i ] and rightMin > arr [ i ] :
            return i
        rightMin = min ( rightMin , arr [ i ] )
    return - 1


#TOFILL
