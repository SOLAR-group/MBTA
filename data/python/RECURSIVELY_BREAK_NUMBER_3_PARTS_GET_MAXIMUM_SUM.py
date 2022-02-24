import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if ( n == 0 or n == 1 ) :
        return n
    return max ( ( f_gold ( n // 2 ) + f_gold ( n // 3 ) + f_gold ( n // 4 ) ) , n )


#TOFILL
