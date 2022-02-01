# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x , y ) :
    while ( y != 0 ) :
        carry = x & y
        x = x ^ y
        y = carry << 1
    return x


#TOFILL
