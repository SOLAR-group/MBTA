import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    one_count = 0
    zero_count = 0
    n = len ( str )
    for i in range ( 0 , n , 1 ) :
        if ( str [ i ] == '1' ) :
            one_count += 1
        else :
            zero_count += 1
    if ( one_count % 2 == 0 ) :
        return zero_count
    return one_count


#TOFILL
