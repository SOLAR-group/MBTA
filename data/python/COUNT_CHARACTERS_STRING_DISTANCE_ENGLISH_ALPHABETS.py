import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str1 ) :
    result = 0 ;
    n = len ( str1 )
    for i in range ( 0 , n ) :
        for j in range ( i + 1 , n ) :
            if ( abs ( ord ( str1 [ i ] ) - ord ( str1 [ j ] ) ) == abs ( i - j ) ) :
                result += 1 ;
    return result ;


#TOFILL
