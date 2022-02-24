import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , x ) :
    i = 0
    while ( i < n ) :
        if ( arr [ i ] == x ) :
            return i
        i = i + abs ( arr [ i ] - x )
    print ( "number is not present!" )
    return - 1


#TOFILL
