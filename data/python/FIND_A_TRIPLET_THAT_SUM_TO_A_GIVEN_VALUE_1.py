# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( A , arr_size , sum ) :
    A.sort ( )
    for i in range ( 0 , arr_size - 2 ) :
        l = i + 1
        r = arr_size - 1
        while ( l < r ) :
            if ( A [ i ] + A [ l ] + A [ r ] == sum ) :
                print ( "Triplet is" , A [ i ] , ', ' , A [ l ] , ', ' , A [ r ] ) ;
                return True
            elif ( A [ i ] + A [ l ] + A [ r ] < sum ) :
                l += 1
            else :
                r -= 1
    return False


#TOFILL
