# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , k ) :
    for i in range ( 0 , k ) :
        x = arr [ 0 ]
        for j in range ( 0 , n - 1 ) :
            arr [ j ] = arr [ j + 1 ]
        arr [ n - 1 ] = x


#TOFILL
