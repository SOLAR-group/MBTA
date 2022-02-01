# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    table = [ 0 ] * ( n + 1 )
    for i in range ( n + 1 ) :
        table [ i ] = n - i
    for i in range ( n , 0 , - 1 ) :
        if ( not ( i % 2 ) ) :
            table [ i // 2 ] = min ( table [ i ] + 1 , table [ i // 2 ] )
        if ( not ( i % 3 ) ) :
            table [ i // 3 ] = min ( table [ i ] + 1 , table [ i // 3 ] )
    return table [ 1 ]


#TOFILL
