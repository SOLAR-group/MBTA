import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , k ) :
    for i in range ( n ) :
        count = 0
        for j in range ( n ) :
            if arr [ j ] == arr [ i ] :
                count += 1
            if count > 2 * k :
                return False
    return True


#TOFILL
