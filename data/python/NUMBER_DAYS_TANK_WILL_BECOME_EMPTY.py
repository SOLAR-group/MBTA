import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( C , l ) :
    if ( l >= C ) : return C
    eq_root = ( math.sqrt ( 1 + 8 * ( C - l ) ) - 1 ) / 2
    return math.ceil ( eq_root ) + l


#TOFILL
