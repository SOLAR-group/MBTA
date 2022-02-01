# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    neg = 0
    pos = 0
    sum = 0
    for i in range ( 0 , n ) :
        sum += arr [ i ]
        if ( arr [ i ] < 0 ) :
            neg += 1
        else :
            pos += 1
    return ( sum / abs ( neg - pos ) )


#TOFILL
