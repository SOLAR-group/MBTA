import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x ) :
    res = 0 ;
    count = 0 ;
    count += 1 ;
    if ( count == 1 ) :
        res = x ;
    else :
        i = random.randrange ( count ) ;
        if ( i == count - 1 ) :
            res = x ;
    return res ;


#TOFILL
