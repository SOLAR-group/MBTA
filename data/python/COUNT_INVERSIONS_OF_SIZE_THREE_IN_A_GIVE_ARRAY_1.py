# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    invcount = 0
    for i in range ( 1 , n - 1 ) :
        small = 0
        for j in range ( i + 1 , n ) :
            if ( arr [ i ] > arr [ j ] ) :
                small += 1
        great = 0 ;
        for j in range ( i - 1 , - 1 , - 1 ) :
            if ( arr [ i ] < arr [ j ] ) :
                great += 1
        invcount += great * small
    return invcount


#TOFILL