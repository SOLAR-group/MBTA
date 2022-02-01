# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    ans = 0
    maxele = max ( arr )
    for i in range ( 2 , maxele + 1 ) :
        count = 0
        for j in range ( n ) :
            if ( arr [ j ] % i == 0 ) :
                count += 1
        ans = max ( ans , count )
    return ans


#TOFILL
