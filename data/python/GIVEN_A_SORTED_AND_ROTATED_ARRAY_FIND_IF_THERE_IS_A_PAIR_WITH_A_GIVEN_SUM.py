# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , x ) :
    for i in range ( 0 , n - 1 ) :
        if ( arr [ i ] > arr [ i + 1 ] ) :
            break ;
    l = ( i + 1 ) % n
    r = i
    while ( l != r ) :
        if ( arr [ l ] + arr [ r ] == x ) :
            return True ;
        if ( arr [ l ] + arr [ r ] < x ) :
            l = ( l + 1 ) % n ;
        else :
            r = ( n + r - 1 ) % n ;
    return False ;


#TOFILL
