# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , x , y ) :
    if a == 0 :
        x = 0
        y = 1
        return b
    x1 = 1
    y1 = 1
    gcd = f_gold ( b % a , a , x1 , y1 )
    x = y1 - ( b / a ) * x1
    y = x1
    return gcd


#TOFILL
