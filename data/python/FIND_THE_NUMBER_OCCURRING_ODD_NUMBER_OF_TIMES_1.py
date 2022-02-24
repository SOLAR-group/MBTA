import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , size ) :
    Hash = dict ( )
    for i in range ( size ) :
        Hash [ arr [ i ] ] = Hash.get ( arr [ i ] , 0 ) + 1 ;
    for i in Hash :
        if ( Hash [ i ] % 2 != 0 ) :
            return i
    return - 1


#TOFILL
