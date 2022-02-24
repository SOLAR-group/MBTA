import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if ( n == 0 or n == 9 ) :
        return True
    if ( n < 9 ) :
        return False
    return f_gold ( ( int ) ( n >> 3 ) - ( int ) ( n & 7 ) )


#TOFILL
