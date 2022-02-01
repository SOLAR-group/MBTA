# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , n , k ) :
    a.sort ( reverse = True )
    b.sort ( )
    for i in range ( n ) :
        if ( a [ i ] + b [ i ] < k ) :
            return False
    return True


#TOFILL
