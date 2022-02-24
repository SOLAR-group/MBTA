import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , mod ) :
    res = 0 ;
    a = a % mod ;
    while ( b ) :
        if ( b & 1 ) :
            res = ( res + a ) % mod ;
        a = ( 2 * a ) % mod ;
        b >>= 1 ;
    return res ;


#TOFILL
