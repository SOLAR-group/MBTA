import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    found = False
    arr.sort ( )
    for i in range ( 0 , n - 1 ) :
        l = i + 1
        r = n - 1
        x = arr [ i ]
        while ( l < r ) :
            if ( x + arr [ l ] + arr [ r ] == 0 ) :
                print ( x , arr [ l ] , arr [ r ] )
                l += 1
                r -= 1
                found = True
            elif ( x + arr [ l ] + arr [ r ] < 0 ) :
                l += 1
            else :
                r -= 1
    if ( found == False ) :
        print ( " No Triplet Found" )


#TOFILL
