import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , N ) :
    lis = [ 0 ] * N
    for i in range ( N ) :
        lis [ i ] = 1
    for i in range ( 1 , N ) :
        for j in range ( i ) :
            if ( arr [ i ] >= arr [ j ] and lis [ i ] < lis [ j ] + 1 ) :
                lis [ i ] = lis [ j ] + 1
    max = 0
    for i in range ( N ) :
        if ( max < lis [ i ] ) :
            max = lis [ i ]
    return ( N - max )


#TOFILL
