import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    n = len ( str )
    res = - 1
    for i in range ( 0 , n - 1 ) :
        for j in range ( i + 1 , n ) :
            if ( str [ i ] == str [ j ] ) :
                res = max ( res , abs ( j - i - 1 ) )
    return res


#TOFILL
