# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    x = n
    y = 1
    e = 0.000001
    while ( x - y > e ) :
        x = ( x + y ) / 2
        y = n / x
    return x


#TOFILL
