import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , k ) :
    count = 0
    for i in range ( 0 , n ) :
        if ( arr [ i ] <= k ) :
            count = count + 1
    bad = 0
    for i in range ( 0 , count ) :
        if ( arr [ i ] > k ) :
            bad = bad + 1
    ans = bad
    j = count
    for i in range ( 0 , n ) :
        if ( j == n ) :
            break
        if ( arr [ i ] > k ) :
            bad = bad - 1
        if ( arr [ j ] > k ) :
            bad = bad + 1
        ans = min ( ans , bad )
        j = j + 1
    return ans


#TOFILL
