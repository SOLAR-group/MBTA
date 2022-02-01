# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , low , high ) :
    if ( high < low ) :
        return 0
    if ( high == low ) :
        return low
    mid = low + ( high - low ) / 2 ;
    mid = int ( mid )
    if ( mid < high and arr [ mid + 1 ] < arr [ mid ] ) :
        return ( mid + 1 )
    if ( mid > low and arr [ mid ] < arr [ mid - 1 ] ) :
        return mid
    if ( arr [ high ] > arr [ mid ] ) :
        return f_gold ( arr , low , mid - 1 ) ;
    return f_gold ( arr , mid + 1 , high )


#TOFILL
