# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    aCount = 0
    bCount = 0
    cCount = 0
    for i in range ( len ( s ) ) :
        if ( s [ i ] == 'a' ) :
            aCount = ( 1 + 2 * aCount )
        elif ( s [ i ] == 'b' ) :
            bCount = ( aCount + 2 * bCount )
        elif ( s [ i ] == 'c' ) :
            cCount = ( bCount + 2 * cCount )
    return cCount


#TOFILL
