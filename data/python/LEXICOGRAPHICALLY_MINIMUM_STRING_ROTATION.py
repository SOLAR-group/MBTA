# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str_ ) :
    n = len ( str_ )
    arr = [ 0 ] * n
    concat = str_ + str_
    for i in range ( n ) :
        arr [ i ] = concat [ i : n + i ]
    arr.sort ( )
    return arr [ 0 ]


#TOFILL
