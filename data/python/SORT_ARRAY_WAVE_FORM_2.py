import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    arr.sort ( )
    for i in range ( 0 , n - 1 , 2 ) :
        arr [ i ] , arr [ i + 1 ] = arr [ i + 1 ] , arr [ i ]


#TOFILL
