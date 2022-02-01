# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    LIS = [ 0 for i in range ( n ) ]
    len = 0
    for i in range ( n ) :
        LIS [ i ] = 1
    for i in range ( 1 , n ) :
        for j in range ( i ) :
            if ( arr [ i ] > arr [ j ] and ( i - j ) <= ( arr [ i ] - arr [ j ] ) ) :
                LIS [ i ] = max ( LIS [ i ] , LIS [ j ] + 1 )
        len = max ( len , LIS [ i ] )
    return ( n - len )


#TOFILL
