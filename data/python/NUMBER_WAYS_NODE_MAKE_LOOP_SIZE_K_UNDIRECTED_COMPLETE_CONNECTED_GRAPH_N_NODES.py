import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , k ) :
    p = 1
    if ( k % 2 ) :
        p = - 1
    return ( pow ( n - 1 , k ) + p * ( n - 1 ) ) / n


#TOFILL
