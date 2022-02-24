import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    i = - 1
    j = 0
    while ( j != n ) :
        if ( arr [ j ] % 2 == 0 ) :
            i = i + 1
            arr [ i ] , arr [ j ] = arr [ j ] , arr [ i ]
        j = j + 1
    for i in arr :
        print ( str ( i ) + " " , end = '' )


#TOFILL
