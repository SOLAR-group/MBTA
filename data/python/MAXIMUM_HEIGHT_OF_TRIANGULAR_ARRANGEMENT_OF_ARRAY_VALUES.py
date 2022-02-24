import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , n ) :
    result = 1
    for i in range ( 1 , n ) :
        y = ( i * ( i + 1 ) ) / 2
        if ( y < n ) :
            result = i
        else :
            break
    return result


#TOFILL
