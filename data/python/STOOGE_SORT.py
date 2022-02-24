import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , l , h ) :
    if l >= h :
        return
    if arr [ l ] > arr [ h ] :
        t = arr [ l ]
        arr [ l ] = arr [ h ]
        arr [ h ] = t
    if h - l + 1 > 2 :
        t = ( int ) ( ( h - l + 1 ) / 3 )
        f_gold ( arr , l , ( h - t ) )
        f_gold ( arr , l + t , ( h ) )
        f_gold ( arr , l , ( h - t ) )


#TOFILL
