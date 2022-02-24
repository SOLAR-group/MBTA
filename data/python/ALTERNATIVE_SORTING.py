import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    arr.sort ( )
    i = 0
    j = n - 1
    while ( i < j ) :
        print ( arr [ j ] , end = " " )
        j -= 1
        print ( arr [ i ] , end = " " )
        i += 1
    if ( n % 2 != 0 ) :
        print ( arr [ i ] )


#TOFILL
