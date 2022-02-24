import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x , y , z ) :
    c = 0
    while ( x and y and z ) :
        x = x - 1
        y = y - 1
        z = z - 1
        c = c + 1
    return c


#TOFILL
