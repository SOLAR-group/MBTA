import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , n ) :
    a.sort ( ) ;
    s = [ ] ;
    i = 0 ;
    j = n - 1 ;
    while ( i < j ) :
        s.append ( ( a [ i ] + a [ j ] ) ) ;
        i += 1 ;
        j -= 1 ;
    mini = min ( s ) ;
    maxi = max ( s ) ;
    return abs ( maxi - mini ) ;


#TOFILL
