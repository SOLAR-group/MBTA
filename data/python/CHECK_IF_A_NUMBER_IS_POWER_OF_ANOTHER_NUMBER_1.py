# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( x , y ) :
    res1 = math.log ( y ) / math.log ( x ) ;
    res2 = math.log ( y ) / math.log ( x ) ;
    return 1 if ( res1 == res2 ) else 0 ;


#TOFILL
