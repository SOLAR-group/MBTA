# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , n , k ) :
    result = 0
    for i in range ( n ) :
        if ( a [ i ] != 1 and a [ i ] > k ) :
            result = ( result + min ( a [ i ] % k , k - a [ i ] % k ) )
        else :
            result = result + k - a [ i ]
    return result


#TOFILL
