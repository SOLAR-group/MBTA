import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    if n <= 1 :
        return
    f_gold ( arr , n - 1 )
    last = arr [ n - 1 ]
    j = n - 2
    while ( j >= 0 and arr [ j ] > last ) :
        arr [ j + 1 ] = arr [ j ]
        j = j - 1
    arr [ j + 1 ] = last


#TOFILL
