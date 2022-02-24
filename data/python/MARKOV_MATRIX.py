import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( m ) :
    for i in range ( 0 , len ( m ) ) :
        sm = 0
        for j in range ( 0 , len ( m [ i ] ) ) :
            sm = sm + m [ i ] [ j ]
        if ( sm != 1 ) :
            return False
    return True


#TOFILL
