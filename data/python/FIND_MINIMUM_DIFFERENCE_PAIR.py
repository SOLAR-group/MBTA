# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    diff = 10 ** 20
    for i in range ( n - 1 ) :
        for j in range ( i + 1 , n ) :
            if abs ( arr [ i ] - arr [ j ] ) < diff :
                diff = abs ( arr [ i ] - arr [ j ] )
    return diff


#TOFILL
