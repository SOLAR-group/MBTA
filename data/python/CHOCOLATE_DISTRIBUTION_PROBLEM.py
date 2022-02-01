# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import sys

def f_gold ( arr , n , m ) :
    if ( m == 0 or n == 0 ) :
        return 0
    arr.sort ( )
    if ( n < m ) :
        return - 1
    min_diff = sys.maxsize
    first = 0
    last = 0
    i = 0
    while ( i + m - 1 < n ) :
        diff = arr [ i + m - 1 ] - arr [ i ]
        if ( diff < min_diff ) :
            min_diff = diff
            first = i
            last = i + m - 1
        i += 1
    return ( arr [ last ] - arr [ first ] )


#TOFILL
