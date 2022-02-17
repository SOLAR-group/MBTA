# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x ) :
    if ( x == 0 or x == 1 ) :
        return x
    start = 1
    end = x
    while ( start <= end ) :
        mid = ( start + end ) // 2
        if ( mid * mid == x ) :
            return mid
        if ( mid * mid < x ) :
            start = mid + 1
            ans = mid
        else :
            end = mid - 1
    return ans


#TOFILL