import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , arr_size ) :
    for i in range ( 0 , arr_size ) :
        count = 0
        for j in range ( 0 , arr_size ) :
            if arr [ i ] == arr [ j ] :
                count += 1
        if ( count % 2 != 0 ) :
            return arr [ i ]
    return - 1


#TOFILL
