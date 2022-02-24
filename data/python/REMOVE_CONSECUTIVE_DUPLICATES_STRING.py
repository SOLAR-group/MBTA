import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( S ) :
    n = len ( S )
    if ( n < 2 ) :
        return
    j = 0
    for i in range ( n ) :
        if ( S [ j ] != S [ i ] ) :
            j += 1
            S [ j ] = S [ i ]
    j += 1
    S = S [ : j ]
    return S


#TOFILL
