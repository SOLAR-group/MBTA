# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , n ) :
    x1 = a [ 0 ]
    x2 = 1
    for i in range ( 1 , n ) :
        x1 = x1 ^ a [ i ]
    for i in range ( 2 , n + 2 ) :
        x2 = x2 ^ i
    return x1 ^ x2


#TOFILL
