# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s , c ) :
    res = 0
    for i in range ( len ( s ) ) :
        if ( s [ i ] == c ) :
            res = res + 1
    return res


#TOFILL
