import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , k , n1 , n2 ) :
    s = set ( )
    for i in range ( n2 ) :
        s.add ( b [ i ] )
    missing = 0
    for i in range ( n1 ) :
        if a [ i ] not in s :
            missing += 1
        if missing == k :
            return a [ i ]
    return - 1


#TOFILL
