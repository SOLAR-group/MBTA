import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , index , Sum , M , arr , dp ) :
    global MAX
    if index == n :
        if ( Sum % M ) == 0 :
            return True
        return False
    if dp [ index ] [ Sum ] != - 1 :
        return dp [ index ] [ Sum ]
    placeAdd = f_gold ( n , index + 1 , Sum + arr [ index ] , M , arr , dp )
    placeMinus = f_gold ( n , index + 1 , Sum - arr [ index ] , M , arr , dp )
    res = placeAdd or placeMinus
    dp [ index ] [ Sum ] = res
    return res


#TOFILL
