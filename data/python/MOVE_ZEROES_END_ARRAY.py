import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    count = 0
    for i in range ( n ) :
        if arr [ i ] != 0 :
            arr [ count ] = arr [ i ]
            count += 1
    while count < n :
        arr [ count ] = 0
        count += 1


#TOFILL
