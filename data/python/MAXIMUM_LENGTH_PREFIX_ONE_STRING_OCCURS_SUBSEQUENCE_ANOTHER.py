# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s , t ) :
    count = 0
    for i in range ( 0 , len ( t ) ) :
        if ( count == len ( s ) ) :
            break
        if ( t [ i ] == s [ count ] ) :
            count = count + 1
    return count


#TOFILL
