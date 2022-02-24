import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , p ) :
    ans = 0 ;
    for x in range ( 1 , p ) :
        if ( ( x * x ) % p == 1 ) :
            last = x + p * ( n / p ) ;
            if ( last > n ) :
                last -= p ;
            ans += ( ( last - x ) / p + 1 ) ;
    return int ( ans ) ;


#TOFILL
