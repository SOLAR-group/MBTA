import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , k ) :
    result = + 2147483647
    arr.sort ( )
    for i in range ( n - k + 1 ) :
        result = int ( min ( result , arr [ i + k - 1 ] - arr [ i ] ) )
    return result


#TOFILL
