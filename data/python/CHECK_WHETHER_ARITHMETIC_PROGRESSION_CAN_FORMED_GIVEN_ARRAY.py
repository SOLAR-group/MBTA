import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    if ( n == 1 ) : return True
    arr.sort ( )
    d = arr [ 1 ] - arr [ 0 ]
    for i in range ( 2 , n ) :
        if ( arr [ i ] - arr [ i - 1 ] != d ) :
            return False
    return True


#TOFILL
