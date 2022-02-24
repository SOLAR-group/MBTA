import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( X , Y , m , n ) :
    LCSuff = [ [ 0 for k in range ( n + 1 ) ] for l in range ( m + 1 ) ]
    result = 0
    for i in range ( m + 1 ) :
        for j in range ( n + 1 ) :
            if ( i == 0 or j == 0 ) :
                LCSuff [ i ] [ j ] = 0
            elif ( X [ i - 1 ] == Y [ j - 1 ] ) :
                LCSuff [ i ] [ j ] = LCSuff [ i - 1 ] [ j - 1 ] + 1
                result = max ( result , LCSuff [ i ] [ j ] )
            else :
                LCSuff [ i ] [ j ] = 0
    return result


#TOFILL
