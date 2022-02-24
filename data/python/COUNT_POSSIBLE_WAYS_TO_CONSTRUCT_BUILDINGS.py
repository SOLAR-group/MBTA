import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( N ) :
    if ( N == 1 ) :
        return 4
    countB = 1
    countS = 1
    for i in range ( 2 , N + 1 ) :
        prev_countB = countB
        prev_countS = countS
        countS = prev_countB + prev_countS
        countB = prev_countS
    result = countS + countB
    return ( result * result )


#TOFILL
