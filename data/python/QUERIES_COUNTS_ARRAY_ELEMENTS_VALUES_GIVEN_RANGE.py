import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , x , y ) :
    count = 0 ;
    for i in range ( n ) :
        if ( arr [ i ] >= x and arr [ i ] <= y ) :
            count += 1
    return count


#TOFILL
