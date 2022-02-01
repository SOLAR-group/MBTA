# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , N ) :
    if N < 3 :
        return False
    arr.sort ( )
    for i in range ( N - 2 ) :
        if arr [ i ] + arr [ i + 1 ] > arr [ i + 2 ] :
            return True


#TOFILL
