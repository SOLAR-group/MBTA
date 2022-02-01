# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , n , m ) :
    sum1 = 0
    sum2 = 0
    for i in range ( 0 , n ) :
        sum1 = 0
        sum2 = 0
        for j in range ( 0 , m ) :
            sum1 += a [ i ] [ j ]
            sum2 += a [ j ] [ i ]
        if ( sum1 == sum2 ) :
            return 1
    return 0


#TOFILL
