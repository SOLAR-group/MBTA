# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( num ) :
    result = 0
    i = 2
    while i <= ( math.sqrt ( num ) ) :
        if ( num % i == 0 ) :
            if ( i == ( num / i ) ) :
                result = result + i ;
            else :
                result = result + ( i + num / i ) ;
        i = i + 1
    return ( result + 1 ) ;


#TOFILL
