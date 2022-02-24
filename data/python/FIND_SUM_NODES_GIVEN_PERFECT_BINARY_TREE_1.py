import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( l ) :
    leafNodeCount = math.pow ( 2 , l - 1 ) ;
    sumLastLevel = 0 ;
    sumLastLevel = ( ( leafNodeCount * ( leafNodeCount + 1 ) ) / 2 ) ;
    sum = sumLastLevel * l ;
    return int ( sum ) ;


#TOFILL
