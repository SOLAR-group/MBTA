# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , N , k ) :
    MS = [ 0 for i in range ( N ) ]
    MS [ N - 1 ] = arr [ N - 1 ]
    for i in range ( N - 2 , - 1 , - 1 ) :
        if ( i + k + 1 >= N ) :
            MS [ i ] = max ( arr [ i ] , MS [ i + 1 ] )
        else :
            MS [ i ] = max ( arr [ i ] + MS [ i + k + 1 ] , MS [ i + 1 ] )
    return MS [ 0 ]


#TOFILL
