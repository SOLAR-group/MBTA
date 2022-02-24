import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    result = 0 ;
    n = len ( s ) ;
    for i in range ( n ) :
        for j in range ( i , n ) :
            if ( s [ i ] == s [ j ] ) :
                result = result + 1
    return result


#TOFILL
