import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , p ) :
    n = n % p
    for x in range ( 2 , p , 1 ) :
        if ( ( x * x ) % p == n ) :
            return True
    return False


#TOFILL
