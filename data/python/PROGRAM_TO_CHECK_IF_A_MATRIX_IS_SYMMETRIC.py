# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( mat , N ) :
    for i in range ( N ) :
        for j in range ( N ) :
            if ( mat [ i ] [ j ] != mat [ j ] [ i ] ) :
                return False
    return True


#TOFILL
