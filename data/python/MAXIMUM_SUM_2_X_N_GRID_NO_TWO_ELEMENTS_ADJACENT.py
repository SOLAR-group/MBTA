import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( grid , n ) :
    incl = max ( grid [ 0 ] [ 0 ] , grid [ 1 ] [ 0 ] )
    excl = 0
    for i in range ( 1 , n ) :
        excl_new = max ( excl , incl )
        incl = excl + max ( grid [ 0 ] [ i ] , grid [ 1 ] [ i ] )
        excl = excl_new
    return max ( excl , incl )


#TOFILL
