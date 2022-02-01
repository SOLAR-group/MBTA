# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , x , y ) :
    arr = [ False for i in range ( n + 2 ) ]
    if ( x <= n ) :
        arr [ x ] = True
    if ( y <= n ) :
        arr [ y ] = True
    result = 0
    for i in range ( min ( x , y ) , n + 1 ) :
        if ( arr [ i ] ) :
            if ( i + x <= n ) :
                arr [ i + x ] = True
            if ( i + y <= n ) :
                arr [ i + y ] = True
            result = result + 1
    return result


#TOFILL
