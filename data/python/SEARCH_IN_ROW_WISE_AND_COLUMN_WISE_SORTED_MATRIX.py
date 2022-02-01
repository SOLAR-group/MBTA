# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( mat , n , x ) :
    i = 0
    j = n - 1
    while ( i < n and j >= 0 ) :
        if ( mat [ i ] [ j ] == x ) :
            print ( "n Found at " , i , ", " , j )
            return 1
        if ( mat [ i ] [ j ] > x ) :
            j -= 1
        else :
            i += 1
    print ( "Element not found" )
    return 0


#TOFILL
