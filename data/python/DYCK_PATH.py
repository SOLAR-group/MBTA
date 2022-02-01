# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    res = 1
    for i in range ( 0 , n ) :
        res *= ( 2 * n - i )
        res /= ( i + 1 )
    return res / ( n + 1 )


#TOFILL
