import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    sum = 0
    for i in range ( 1 , n + 1 ) :
        sum = sum + ( 2 * i - 1 ) * ( 2 * i - 1 )
    return sum


#TOFILL
