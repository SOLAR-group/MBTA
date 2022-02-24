import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , i , n ) :
    if i > int ( ( n - 2 ) / 2 ) :
        return True
    if ( arr [ i ] >= arr [ 2 * i + 1 ] and arr [ i ] >= arr [ 2 * i + 2 ] and f_gold ( arr , 2 * i + 1 , n ) and f_gold ( arr , 2 * i + 2 , n ) ) :
        return True
    return False


#TOFILL
