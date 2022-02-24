import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    um = dict ( )
    curr_sum = 0
    for i in range ( n ) :
        curr_sum += ( - 1 if ( arr [ i ] == 0 ) else arr [ i ] )
        if um.get ( curr_sum ) :
            um [ curr_sum ] += 1
        else :
            um [ curr_sum ] = 1
    count = 0
    for itr in um :
        if um [ itr ] > 1 :
            count += ( ( um [ itr ] * int ( um [ itr ] - 1 ) ) / 2 )
    if um.get ( 0 ) :
        count += um [ 0 ]
    return int ( count )


#TOFILL
