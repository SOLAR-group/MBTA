# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , l , r , x ) :
    if r >= l :
        mid = l + ( r - l ) // 2
        if arr [ mid ] == x :
            return mid
        elif arr [ mid ] > x :
            return f_gold ( arr , l , mid - 1 , x )
        else :
            return f_gold ( arr , mid + 1 , r , x )
    else :
        return - 1


#TOFILL
