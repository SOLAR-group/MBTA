# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if ( n <= 1 ) :
        return n
    a = 0
    b = 1
    c = 1
    res = 1
    while ( c < n ) :
        c = a + b
        res = res + 1
        a = b
        b = c
    return res


#TOFILL
