import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    if ( b == 0 ) :
        return 1
    answer = a
    increment = a
    for i in range ( 1 , b ) :
        for j in range ( 1 , a ) :
            answer += increment
        increment = answer
    return answer


#TOFILL
