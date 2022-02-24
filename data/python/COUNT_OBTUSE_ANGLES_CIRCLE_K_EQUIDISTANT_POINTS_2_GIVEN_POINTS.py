import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , k ) :
    c1 = ( b - a ) - 1
    c2 = ( k - b ) + ( a - 1 )
    if ( c1 == c2 ) :
        return 0
    return min ( c1 , c2 )


#TOFILL
