import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num ) :
    l = len ( num )
    count_zero = 0
    i = 1
    while i < l :
        ch = num [ i ]
        if ( ch == "0" ) :
            count_zero = count_zero + 1
        i = i + 1
    return count_zero


#TOFILL
