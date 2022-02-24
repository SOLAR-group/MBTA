import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    if ( a == b ) :
        return a
    if ( a == 0 ) :
        return b
    if ( b == 0 ) :
        return a
    if ( ( ~ a & 1 ) == 1 ) :
        if ( ( b & 1 ) == 1 ) :
            return f_gold ( a >> 1 , b )
        else :
            return ( f_gold ( a >> 1 , b >> 1 ) << 1 )
    if ( ( ~ b & 1 ) == 1 ) :
        return f_gold ( a , b >> 1 )
    if ( a > b ) :
        return f_gold ( ( a - b ) >> 1 , b )
    return f_gold ( ( b - a ) >> 1 , a )


#TOFILL
