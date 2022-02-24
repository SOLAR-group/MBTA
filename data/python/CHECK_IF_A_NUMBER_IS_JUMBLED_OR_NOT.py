import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num ) :
    if ( num // 10 == 0 ) :
        return True
    while ( num != 0 ) :
        if ( num // 10 == 0 ) :
            return True
        digit1 = num % 10
        digit2 = ( num // 10 ) % 10
        if ( abs ( digit2 - digit1 ) > 1 ) :
            return False
        num = num // 10
    return True


#TOFILL
