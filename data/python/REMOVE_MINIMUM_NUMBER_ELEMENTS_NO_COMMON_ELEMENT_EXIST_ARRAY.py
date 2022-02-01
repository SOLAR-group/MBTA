# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , n , m ) :
    countA = dict ( )
    countB = dict ( )
    for i in range ( n ) :
        countA [ a [ i ] ] = countA.get ( a [ i ] , 0 ) + 1
    for i in range ( n ) :
        countB [ b [ i ] ] = countB.get ( b [ i ] , 0 ) + 1
    res = 0
    for x in countA :
        if x in countB.keys ( ) :
            res += min ( countA [ x ] , countB [ x ] )
    return res


#TOFILL
