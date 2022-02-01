# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( dist ) :
    count = [ 0 ] * ( dist + 1 )
    count [ 0 ] = 1
    count [ 1 ] = 1
    count [ 2 ] = 2
    for i in range ( 3 , dist + 1 ) :
        count [ i ] = ( count [ i - 1 ] + count [ i - 2 ] + count [ i - 3 ] )
    return count [ dist ] ;


#TOFILL
