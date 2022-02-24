import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( m , n ) :
    for i in range ( 0 , n ) :
        sum = 0
        for j in range ( 0 , n ) :
            sum = sum + abs ( m [ i ] [ j ] )
        sum = sum - abs ( m [ i ] [ i ] )
        if ( abs ( m [ i ] [ i ] ) < sum ) :
            return False
    return True


#TOFILL
