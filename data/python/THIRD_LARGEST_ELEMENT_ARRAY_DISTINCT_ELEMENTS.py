import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import sys

def f_gold ( arr , arr_size ) :
    if ( arr_size < 3 ) :
        print ( " Invalid Input " )
        return
    first = arr [ 0 ]
    for i in range ( 1 , arr_size ) :
        if ( arr [ i ] > first ) :
            first = arr [ i ]
    second = - sys.maxsize
    for i in range ( 0 , arr_size ) :
        if ( arr [ i ] > second and arr [ i ] < first ) :
            second = arr [ i ]
    third = - sys.maxsize
    for i in range ( 0 , arr_size ) :
        if ( arr [ i ] > third and arr [ i ] < second ) :
            third = arr [ i ]
    print ( "The Third Largest" , "element is" , third )


#TOFILL
