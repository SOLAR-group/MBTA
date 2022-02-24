import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if ( n <= 1 ) :
        return False
    if ( n <= 3 ) :
        return False
    if ( n % 2 == 0 or n % 3 == 0 ) :
        return True
    i = 5
    while ( i * i <= n ) :
        if ( n % i == 0 or n % ( i + 2 ) == 0 ) :
            return True
        i = i + 6
    return False


#TOFILL
