import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x ) :
    if ( x == 0 or x == 1 ) :
        return x
    i = 1 ; result = 1
    while ( result <= x ) :
        i += 1
        result = i * i
    return i - 1


#TOFILL
