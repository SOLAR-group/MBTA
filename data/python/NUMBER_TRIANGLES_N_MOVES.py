import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    answer = [ None ] * ( n + 1 ) ;
    answer [ 0 ] = 1 ;
    i = 1
    while i <= n :
        answer [ i ] = answer [ i - 1 ] * 3 + 2 ;
        i = i + 1
    return answer [ n ] ;


#TOFILL
