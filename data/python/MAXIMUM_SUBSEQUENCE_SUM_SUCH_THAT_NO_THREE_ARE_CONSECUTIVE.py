# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    sum = [ 0 for k in range ( n ) ]
    if n >= 1 :
        sum [ 0 ] = arr [ 0 ]
    if n >= 2 :
        sum [ 1 ] = arr [ 0 ] + arr [ 1 ]
    if n > 2 :
        sum [ 2 ] = max ( sum [ 1 ] , max ( arr [ 1 ] + arr [ 2 ] , arr [ 0 ] + arr [ 2 ] ) )
    for i in range ( 3 , n ) :
        sum [ i ] = max ( max ( sum [ i - 1 ] , sum [ i - 2 ] + arr [ i ] ) , arr [ i ] + arr [ i - 1 ] + sum [ i - 3 ] )
    return sum [ n - 1 ]


#TOFILL
