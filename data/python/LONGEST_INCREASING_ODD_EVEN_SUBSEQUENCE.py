import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    lioes = list ( )
    maxLen = 0
    for i in range ( n ) :
        lioes.append ( 1 )
    i = 1
    for i in range ( n ) :
        for j in range ( i ) :
            if ( arr [ i ] > arr [ j ] and ( arr [ i ] + arr [ j ] ) % 2 != 0 and lioes [ i ] < lioes [ j ] + 1 ) :
                lioes [ i ] = lioes [ j ] + 1
    for i in range ( n ) :
        if maxLen < lioes [ i ] :
            maxLen = lioes [ i ]
    return maxLen


#TOFILL
