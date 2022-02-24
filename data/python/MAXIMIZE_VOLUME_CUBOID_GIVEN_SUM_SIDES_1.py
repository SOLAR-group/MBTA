import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    length = int ( s / 3 )
    s -= length
    breadth = s / 2
    height = s - breadth
    return int ( length * breadth * height )


#TOFILL
