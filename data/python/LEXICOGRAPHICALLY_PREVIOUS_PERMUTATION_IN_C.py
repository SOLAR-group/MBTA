import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    n = len ( str ) - 1
    i = n
    while ( i > 0 and str [ i - 1 ] <= str [ i ] ) :
        i -= 1
    if ( i <= 0 ) :
        return False
    j = i - 1
    while ( j + 1 <= n and str [ j + 1 ] <= str [ i - 1 ] ) :
        j += 1
    str = list ( str )
    temp = str [ i - 1 ]
    str [ i - 1 ] = str [ j ]
    str [ j ] = temp
    str = ''.join ( str )
    str [ : : - 1 ]
    return True , str


#TOFILL
