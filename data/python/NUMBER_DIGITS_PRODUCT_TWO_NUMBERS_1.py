# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( a , b ) :
    if ( a == 0 or b == 0 ) :
        return 1
    return math.floor ( math.log10 ( abs ( a ) ) + math.log10 ( abs ( b ) ) ) + 1


#TOFILL
