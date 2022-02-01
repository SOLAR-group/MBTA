# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x , y , p ) :
    res = 1
    x = x % p
    while ( y > 0 ) :
        if ( ( y & 1 ) == 1 ) :
            res = ( res * x ) % p
        y = y >> 1
        x = ( x * x ) % p
    return res


#TOFILL
