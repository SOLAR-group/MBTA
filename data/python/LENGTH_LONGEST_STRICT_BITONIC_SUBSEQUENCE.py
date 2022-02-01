# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    inc , dcr = dict ( ) , dict ( )
    len_inc , len_dcr = [ 0 ] * n , [ 0 ] * n
    longLen = 0
    for i in range ( n ) :
        len = 0
        if inc.get ( arr [ i ] - 1 ) in inc.values ( ) :
            len = inc.get ( arr [ i ] - 1 )
        inc [ arr [ i ] ] = len_inc [ i ] = len + 1
    for i in range ( n - 1 , - 1 , - 1 ) :
        len = 0
        if dcr.get ( arr [ i ] - 1 ) in dcr.values ( ) :
            len = dcr.get ( arr [ i ] - 1 )
        dcr [ arr [ i ] ] = len_dcr [ i ] = len + 1
    for i in range ( n ) :
        if longLen < ( len_inc [ i ] + len_dcr [ i ] - 1 ) :
            longLen = len_inc [ i ] + len_dcr [ i ] - 1
    return longLen


#TOFILL
