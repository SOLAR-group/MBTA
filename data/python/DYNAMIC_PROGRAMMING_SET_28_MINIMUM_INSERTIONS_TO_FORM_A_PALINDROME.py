# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import sys

def f_gold ( str , l , h ) :
    if ( l > h ) :
        return sys.maxsize
    if ( l == h ) :
        return 0
    if ( l == h - 1 ) :
        return 0 if ( str [ l ] == str [ h ] ) else 1
    if ( str [ l ] == str [ h ] ) :
        return f_gold ( str , l + 1 , h - 1 )
    else :
        return ( min ( f_gold ( str , l , h - 1 ) , f_gold ( str , l + 1 , h ) ) + 1 )


#TOFILL
