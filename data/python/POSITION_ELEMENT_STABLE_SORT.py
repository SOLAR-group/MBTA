# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , idx ) :
    result = 0
    for i in range ( n ) :
        if ( arr [ i ] < arr [ idx ] ) :
            result += 1
        if ( arr [ i ] == arr [ idx ] and i < idx ) :
            result += 1
    return result ;


#TOFILL
