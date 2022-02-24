import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , d ) :
    temp = a
    a = min ( a , b )
    b = max ( temp , b )
    if ( d >= b ) :
        return ( d + b - 1 ) / b
    if ( d == 0 ) :
        return 0
    if ( d == a ) :
        return 1
    return 2


#TOFILL
