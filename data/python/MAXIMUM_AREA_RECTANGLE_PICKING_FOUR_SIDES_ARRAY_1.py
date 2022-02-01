# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    s = [ ]
    first = 0
    second = 0
    for i in range ( n ) :
        if arr [ i ] not in s :
            s.append ( arr [ i ] )
            continue
        if ( arr [ i ] > first ) :
            second = first
            first = arr [ i ]
        elif ( arr [ i ] > second ) :
            second = arr [ i ]
    return ( first * second )


#TOFILL
