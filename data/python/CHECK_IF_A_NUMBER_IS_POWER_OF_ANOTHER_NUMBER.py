import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x , y ) :
    if ( x == 1 ) :
        return ( y == 1 )
    pow = 1
    while ( pow < y ) :
        pow = pow * x
    return ( pow == y )


#TOFILL
