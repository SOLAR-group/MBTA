import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , index , modulo , M , arr , dp ) :
    modulo = ( ( modulo % M ) + M ) % M
    if ( index == n ) :
        if ( modulo == 0 ) :
            return 1
        return 0
    if ( dp [ index ] [ modulo ] != - 1 ) :
        return dp [ index ] [ modulo ]
    placeAdd = f_gold ( n , index + 1 , modulo + arr [ index ] , M , arr , dp )
    placeMinus = f_gold ( n , index + 1 , modulo - arr [ index ] , M , arr , dp )
    res = bool ( placeAdd or placeMinus )
    dp [ index ] [ modulo ] = res
    return res


#TOFILL
