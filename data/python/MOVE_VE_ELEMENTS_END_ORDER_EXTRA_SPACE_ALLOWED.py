import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    temp = [ 0 for k in range ( n ) ]
    j = 0
    for i in range ( n ) :
        if ( arr [ i ] >= 0 ) :
            temp [ j ] = arr [ i ]
            j += 1
    if ( j == n or j == 0 ) :
        return
    for i in range ( n ) :
        if ( arr [ i ] < 0 ) :
            temp [ j ] = arr [ i ]
            j += 1
    for k in range ( n ) :
        arr [ k ] = temp [ k ]


#TOFILL
