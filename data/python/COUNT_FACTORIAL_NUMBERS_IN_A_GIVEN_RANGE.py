# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( low , high ) :
    fact = 1
    x = 1
    while ( fact < low ) :
        fact = fact * x
        x += 1
    res = 0
    while ( fact <= high ) :
        res += 1
        fact = fact * x
        x += 1
    return res


#TOFILL
