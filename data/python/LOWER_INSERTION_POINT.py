import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , X ) :
    if ( X < arr [ 0 ] ) :
        return 0 ;
    elif ( X > arr [ n - 1 ] ) :
        return n
    lowerPnt = 0
    i = 1
    while ( i < n and arr [ i ] < X ) :
        lowerPnt = i
        i = i * 2
    while ( lowerPnt < n and arr [ lowerPnt ] < X ) :
        lowerPnt += 1
    return lowerPnt


#TOFILL
