import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( stri , n ) :
    m = dict ( )
    for i in range ( n ) :
        m [ stri [ i ] ] = m.get ( stri [ i ] , 0 ) + 1
    res = 0
    for i in m.values ( ) :
        if i == 2 :
            res += 1
    return res


#TOFILL
