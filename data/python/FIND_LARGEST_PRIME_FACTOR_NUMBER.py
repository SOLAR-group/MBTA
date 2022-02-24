import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    maxPrime = - 1
    while n % 2 == 0 :
        maxPrime = 2
        n >>= 1
    for i in range ( 3 , int ( math.sqrt ( n ) ) + 1 , 2 ) :
        while n % i == 0 :
            maxPrime = i
            n = n / i
    if n > 2 :
        maxPrime = n
    return int ( maxPrime )


#TOFILL
