# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , size , KthIndex ) :
    dict = { }
    vect = [ ]
    for i in range ( size ) :
        if ( arr [ i ] in dict ) :
            dict [ arr [ i ] ] = dict [ arr [ i ] ] + 1
        else :
            dict [ arr [ i ] ] = 1
    for i in range ( size ) :
        if ( dict [ arr [ i ] ] > 1 ) :
            continue
        else :
            KthIndex = KthIndex - 1
        if ( KthIndex == 0 ) :
            return arr [ i ]
    return - 1


#TOFILL
