import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x , y ) :
    res = 1
    for i in range ( y ) :
        res = ( res * x ) % 10
    return res


#TOFILL
