import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    b_count = 0
    res = 0
    for i in range ( len ( s ) ) :
        if s [ ~ i ] == 'a' :
            res = ( res + b_count )
            b_count = ( b_count * 2 )
        else :
            b_count += 1
    return res


#TOFILL
