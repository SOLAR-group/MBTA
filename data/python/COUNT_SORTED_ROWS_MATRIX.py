import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( mat , r , c ) :
    result = 0
    for i in range ( r ) :
        j = 0
        for j in range ( c - 1 ) :
            if mat [ i ] [ j + 1 ] <= mat [ i ] [ j ] :
                break
        if j == c - 2 :
            result += 1
    for i in range ( 0 , r ) :
        j = 0
        for j in range ( c - 1 , 0 , - 1 ) :
            if mat [ i ] [ j - 1 ] <= mat [ i ] [ j ] :
                break
        if c > 1 and j == 1 :
            result += 1
    return result


#TOFILL
