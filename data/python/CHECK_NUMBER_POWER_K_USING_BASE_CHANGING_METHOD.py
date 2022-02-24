import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , k ) :
    oneSeen = False
    while ( n > 0 ) :
        digit = n % k
        if ( digit > 1 ) :
            return False
        if ( digit == 1 ) :
            if ( oneSeen ) :
                return False
            oneSeen = True
        n //= k
    return True


#TOFILL
