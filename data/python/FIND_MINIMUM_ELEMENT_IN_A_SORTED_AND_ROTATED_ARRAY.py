import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , low , high ) :
    if high < low :
        return arr [ 0 ]
    if high == low :
        return arr [ low ]
    mid = int ( ( low + high ) / 2 )
    if mid < high and arr [ mid + 1 ] < arr [ mid ] :
        return arr [ mid + 1 ]
    if mid > low and arr [ mid ] < arr [ mid - 1 ] :
        return arr [ mid ]
    if arr [ high ] > arr [ mid ] :
        return f_gold ( arr , low , mid - 1 )
    return f_gold ( arr , mid + 1 , high )


#TOFILL
