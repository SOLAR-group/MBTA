# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    l = len ( s )
    i = 0
    j = l - 1
    while i <= j :
        if ( s [ i ] != s [ j ] ) :
            return False
        i += 1
        j -= 1
    return True


#TOFILL