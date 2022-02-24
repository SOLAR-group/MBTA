import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , l , r , x ) :
    if ( r >= l ) :
        mid = int ( l + ( r - l ) / 2 )
        if ( arr [ mid ] == x ) : return mid
        if ( mid > l and arr [ mid - 1 ] == x ) :
            return ( mid - 1 )
        if ( mid < r and arr [ mid + 1 ] == x ) :
            return ( mid + 1 )
        if ( arr [ mid ] > x ) :
            return f_gold ( arr , l , mid - 2 , x )
        return f_gold ( arr , mid + 2 , r , x )
    return - 1


#TOFILL
