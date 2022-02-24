import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import random

def f_gold ( arr , n ) :
    for i in range ( n - 1 , 0 , - 1 ) :
        j = random.randint ( 0 , i + 1 )
        arr [ i ] , arr [ j ] = arr [ j ] , arr [ i ]
    return arr


#TOFILL
