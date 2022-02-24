import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( mat , N ) :
    for row in range ( N ) :
        for col in range ( N ) :
            if ( row == col and mat [ row ] [ col ] != 1 ) :
                return False ;
            elif ( row != col and mat [ row ] [ col ] != 0 ) :
                return False ;
    return True ;


#TOFILL
