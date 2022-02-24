import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , size ) :
    positive = 0
    negative = 1
    while ( True ) :
        while ( positive < size and a [ positive ] >= 0 ) :
            positive = positive + 2
        while ( negative < size and a [ negative ] <= 0 ) :
            negative = negative + 2
        if ( positive < size and negative < size ) :
            temp = a [ positive ]
            a [ positive ] = a [ negative ]
            a [ negative ] = temp
        else :
            break


#TOFILL
