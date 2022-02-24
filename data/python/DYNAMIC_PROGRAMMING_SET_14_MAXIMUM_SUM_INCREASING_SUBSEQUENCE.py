import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    max = 0
    msis = [ 0 for x in range ( n ) ]
    for i in range ( n ) :
        msis [ i ] = arr [ i ]
    for i in range ( 1 , n ) :
        for j in range ( i ) :
            if ( arr [ i ] > arr [ j ] and msis [ i ] < msis [ j ] + arr [ i ] ) :
                msis [ i ] = msis [ j ] + arr [ i ]
    for i in range ( n ) :
        if max < msis [ i ] :
            max = msis [ i ]
    return max


#TOFILL
