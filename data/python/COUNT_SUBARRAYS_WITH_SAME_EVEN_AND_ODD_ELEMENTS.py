import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    difference = 0
    ans = 0
    hash_positive = [ 0 ] * ( n + 1 )
    hash_negative = [ 0 ] * ( n + 1 )
    hash_positive [ 0 ] = 1
    for i in range ( n ) :
        if ( arr [ i ] & 1 == 1 ) :
            difference = difference + 1
        else :
            difference = difference - 1
        if ( difference < 0 ) :
            ans += hash_negative [ - difference ]
            hash_negative [ - difference ] = hash_negative [ - difference ] + 1
        else :
            ans += hash_positive [ difference ]
            hash_positive [ difference ] = hash_positive [ difference ] + 1
    return ans


#TOFILL
