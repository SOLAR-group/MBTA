import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , N , k ) :
    maxSum = 0 ;
    arr.sort ( ) ;
    i = N - 1 ;
    while ( i >= 0 ) :
        if ( arr [ i ] - arr [ i - 1 ] < k ) :
            maxSum += arr [ i ] ;
            maxSum += arr [ i - 1 ] ;
            i -= 1 ;
        i -= 1 ;
    return maxSum ;


#TOFILL
