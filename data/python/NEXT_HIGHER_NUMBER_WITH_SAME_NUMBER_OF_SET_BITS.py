# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x ) :
    next = 0
    if ( x ) :
        rightOne = x & - ( x )
        nextHigherOneBit = x + int ( rightOne )
        rightOnesPattern = x ^ int ( nextHigherOneBit )
        rightOnesPattern = ( int ( rightOnesPattern ) / int ( rightOne ) )
        rightOnesPattern = int ( rightOnesPattern ) >> 2
        next = nextHigherOneBit | rightOnesPattern
    return next


#TOFILL