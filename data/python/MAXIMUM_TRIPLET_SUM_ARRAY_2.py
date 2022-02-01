# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    maxA = - 100000000
    maxB = - 100000000
    maxC = - 100000000
    for i in range ( 0 , n ) :
        if ( arr [ i ] > maxA ) :
            maxC = maxB
            maxB = maxA
            maxA = arr [ i ]
        elif ( arr [ i ] > maxB ) :
            maxC = maxB
            maxB = arr [ i ]
        elif ( arr [ i ] > maxC ) :
            maxC = arr [ i ]
    return ( maxA + maxB + maxC )


#TOFILL
