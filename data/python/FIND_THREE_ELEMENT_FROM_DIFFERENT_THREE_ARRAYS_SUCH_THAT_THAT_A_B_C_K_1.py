# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a1 , a2 , a3 , n1 , n2 , n3 , sum ) :
    s = set ( )
    for i in range ( n1 ) :
        s.add ( a1 [ i ] )
    for i in range ( n2 ) :
        for j in range ( n3 ) :
            if sum - a2 [ i ] - a3 [ j ] in s :
                return True
    return False


#TOFILL
