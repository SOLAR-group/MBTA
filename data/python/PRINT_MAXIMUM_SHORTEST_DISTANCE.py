# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , n , k ) :
    b = dict ( )
    for i in range ( n ) :
        x = a [ i ]
        d = min ( 1 + i , n - i )
        if x not in b.keys ( ) :
            b [ x ] = d
        else :
            b [ x ] = min ( d , b [ x ] )
    ans = 10 ** 9
    for i in range ( n ) :
        x = a [ i ]
        if ( x != ( k - x ) and ( k - x ) in b.keys ( ) ) :
            ans = min ( max ( b [ x ] , b [ k - x ] ) , ans )
    return ans


#TOFILL
