# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , n ) :
    i , total = 0 , 1
    for i in range ( 2 , n + 2 ) :
        total += i
        total -= a [ i - 2 ]
    return total


#TOFILL
