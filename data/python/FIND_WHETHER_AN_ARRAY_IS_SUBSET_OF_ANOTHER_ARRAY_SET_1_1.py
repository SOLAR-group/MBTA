import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr1 , arr2 , m , n ) :
    i = 0
    j = 0
    if m < n :
        return 0
    arr1.sort ( )
    arr2.sort ( )
    while i < n and j < m :
        if arr1 [ j ] < arr2 [ i ] :
            j += 1
        elif arr1 [ j ] == arr2 [ i ] :
            j += 1
            i += 1
        elif arr1 [ j ] > arr2 [ i ] :
            return 0
    return False if i < n else True


#TOFILL
