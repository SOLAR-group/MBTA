import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , k ) :
    p = a ** b
    count = 0
    while ( p > 0 and count < k ) :
        rem = p % 10
        count = count + 1
        if ( count == k ) :
            return rem
        p = p / 10 ;


#TOFILL
