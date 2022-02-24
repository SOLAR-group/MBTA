import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( p , q ) :
    dp = [ 1 for i in range ( q ) ]
    for i in range ( p - 1 ) :
        for j in range ( 1 , q ) :
            dp [ j ] += dp [ j - 1 ]
    return dp [ q - 1 ]


#TOFILL
