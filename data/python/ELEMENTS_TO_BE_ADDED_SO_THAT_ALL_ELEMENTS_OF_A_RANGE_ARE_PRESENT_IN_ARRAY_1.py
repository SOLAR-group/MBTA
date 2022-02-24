import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    s = dict ( )
    count , maxm , minm = 0 , - 10 ** 9 , 10 ** 9
    for i in range ( n ) :
        s [ arr [ i ] ] = 1
        if ( arr [ i ] < minm ) :
            minm = arr [ i ]
        if ( arr [ i ] > maxm ) :
            maxm = arr [ i ]
    for i in range ( minm , maxm + 1 ) :
        if i not in s.keys ( ) :
            count += 1
    return count


#TOFILL
