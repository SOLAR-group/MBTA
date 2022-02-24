import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , n ) :
    count = dict ( )
    for i in range ( n ) :
        if count.get ( a [ i ] ) :
            count [ a [ i ] ] += 1
        else :
            count [ a [ i ] ] = 1 ;
    next_missing = 1
    for i in range ( n ) :
        if count [ a [ i ] ] != 1 or a [ i ] > n or a [ i ] < 1 :
            count [ a [ i ] ] -= 1
            while count.get ( next_missing ) :
                next_missing += 1
            a [ i ] = next_missing
            count [ next_missing ] = 1


#TOFILL
