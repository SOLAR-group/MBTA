import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    for i in range ( 0 , n - 1 ) :
        if ( arr [ i ] > arr [ i + 1 ] ) :
            if ( arr [ i ] - arr [ i + 1 ] == 1 ) :
                arr [ i ] , arr [ i + 1 ] = arr [ i + 1 ] , arr [ i ]
            else :
                return False
    return True


#TOFILL
