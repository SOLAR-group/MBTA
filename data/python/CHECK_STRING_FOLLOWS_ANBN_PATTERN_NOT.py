# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    n = len ( str )
    for i in range ( n ) :
        if ( str [ i ] != 'a' ) :
            break
    if ( i * 2 != n ) :
        return False
    for j in range ( i , n ) :
        if ( str [ j ] != 'b' ) :
            return False
    return True


#TOFILL