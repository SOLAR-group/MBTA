import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    d1 = 0
    d2 = 0
    for i in range ( 0 , n ) :
        for j in range ( 0 , n ) :
            if ( i == j ) :
                d1 += arr [ i ] [ j ]
            if ( i == n - j - 1 ) :
                d2 += arr [ i ] [ j ]
    return abs ( d1 - d2 ) ;


#TOFILL
