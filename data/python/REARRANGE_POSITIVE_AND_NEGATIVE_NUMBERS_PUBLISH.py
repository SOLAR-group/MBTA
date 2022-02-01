# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    i = - 1
    for j in range ( n ) :
        if ( arr [ j ] < 0 ) :
            i += 1
            arr [ i ] , arr [ j ] = arr [ j ] , arr [ i ]
    pos , neg = i + 1 , 0
    while ( pos < n and neg < pos and arr [ neg ] < 0 ) :
        arr [ neg ] , arr [ pos ] = arr [ pos ] , arr [ neg ]
        pos += 1
        neg += 2


#TOFILL
