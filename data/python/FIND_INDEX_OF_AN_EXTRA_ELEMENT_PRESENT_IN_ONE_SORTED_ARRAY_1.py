# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr1 , arr2 , n ) :
    index = n
    left = 0
    right = n - 1
    while ( left <= right ) :
        mid = ( int ) ( ( left + right ) / 2 )
        if ( arr2 [ mid ] == arr1 [ mid ] ) :
            left = mid + 1
        else :
            index = mid
            right = mid - 1
    return index


#TOFILL
