import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    count = 0
    if ( n and ( not ( n & ( n - 1 ) ) ) ) :
        while ( n > 1 ) :
            n >>= 1
            count += 1
        if ( count % 2 == 0 ) :
            return True
        else :
            return False


#TOFILL
