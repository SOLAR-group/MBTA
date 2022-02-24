import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( ar , n ) :
    res = 0
    ar.sort ( )
    for i in range ( 0 , n ) :
        count = 1
        for i in range ( n - 1 ) :
            if ar [ i ] == ar [ i + 1 ] :
                count += 1
            else :
                break
        res = max ( res , count )
    return res


#TOFILL
