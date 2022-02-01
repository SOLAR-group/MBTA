# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr1 , arr2 , m , n , x ) :
    count = 0
    for i in range ( m ) :
        for j in range ( n ) :
            if arr1 [ i ] + arr2 [ j ] == x :
                count = count + 1
    return count


#TOFILL
