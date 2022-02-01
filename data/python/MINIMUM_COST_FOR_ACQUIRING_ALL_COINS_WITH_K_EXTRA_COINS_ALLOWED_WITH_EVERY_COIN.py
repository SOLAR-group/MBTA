# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( coin , n , k ) :
    coin.sort ( )
    coins_needed = math.ceil ( 1.0 * n // ( k + 1 ) ) ;
    ans = 0
    for i in range ( coins_needed - 1 + 1 ) :
        ans += coin [ i ]
    return ans


#TOFILL
