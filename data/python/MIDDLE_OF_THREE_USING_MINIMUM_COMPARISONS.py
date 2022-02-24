import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , c ) :
    if ( ( a < b and b < c ) or ( c < b and b < a ) ) :
        return b ;
    if ( ( b < a and a < c ) or ( c < a and a < b ) ) :
        return a ;
    else :
        return c


#TOFILL
