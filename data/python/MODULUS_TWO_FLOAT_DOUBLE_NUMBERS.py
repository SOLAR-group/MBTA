# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    if ( a < 0 ) :
        a = - a
    if ( b < 0 ) :
        b = - b
    mod = a
    while ( mod >= b ) :
        mod = mod - b
    if ( a < 0 ) :
        return - mod
    return mod


#TOFILL
