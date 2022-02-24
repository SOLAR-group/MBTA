import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    c = [ 0 , 0 , 0 ]
    res = 0
    for i in range ( 0 , n ) :
        c [ arr [ i ] % 3 ] += 1
    res += ( ( c [ 0 ] * ( c [ 0 ] - 1 ) ) >> 1 )
    res += c [ 1 ] * c [ 2 ]
    res += ( c [ 0 ] * ( c [ 0 ] - 1 ) * ( c [ 0 ] - 2 ) ) / 6
    res += ( c [ 1 ] * ( c [ 1 ] - 1 ) * ( c [ 1 ] - 2 ) ) / 6
    res += ( ( c [ 2 ] * ( c [ 2 ] - 1 ) * ( c [ 2 ] - 2 ) ) / 6 )
    res += c [ 0 ] * c [ 1 ] * c [ 2 ]
    return res


#TOFILL
