import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr1 , arr2 , n ) :
    for i in range ( 0 , n ) :
        if ( arr1 [ i ] != arr2 [ i ] ) :
            return i
    return n


#TOFILL
