# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    if ( n == 0 or n == 1 ) :
        return True
    for i in range ( 1 , n , 1 ) :
        if ( arr [ i - 1 ] > arr [ i ] ) :
            return False
    return True


#TOFILL
