# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , p ) :
    if n >= p :
        return 0
    result = 1
    for i in range ( 1 , n + 1 ) :
        result = ( result * i ) % p
    return result


#TOFILL
