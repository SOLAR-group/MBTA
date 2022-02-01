# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , k ) :
    if ( k <= 0 ) :
        return n
    return ( n & ~ ( 1 << ( k - 1 ) ) )


#TOFILL
