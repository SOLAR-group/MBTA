# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    ans = 0
    for i in range ( 0 , n ) :
        for j in range ( i + 1 , n ) :
            if ( arr [ i ] == arr [ j ] ) :
                ans += 1
    return ans


#TOFILL
