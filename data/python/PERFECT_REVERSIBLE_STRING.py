# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    i = 0 ; j = len ( str ) - 1 ;
    while ( i < j ) :
        if ( str [ i ] != str [ j ] ) :
            return False ;
        i += 1 ;
        j -= 1 ;
    return True ;


#TOFILL
