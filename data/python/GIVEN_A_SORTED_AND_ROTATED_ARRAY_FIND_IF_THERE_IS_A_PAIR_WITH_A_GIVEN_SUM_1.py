# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , x ) :
    for i in range ( n ) :
        if arr [ i ] > arr [ i + 1 ] :
            break
    l = ( i + 1 ) % n
    r = i
    cnt = 0
    while ( l != r ) :
        if arr [ l ] + arr [ r ] == x :
            cnt += 1
            if l == ( r - 1 + n ) % n :
                return cnt
            l = ( l + 1 ) % n
            r = ( r - 1 + n ) % n
        elif arr [ l ] + arr [ r ] < x :
            l = ( l + 1 ) % n
        else :
            r = ( n + r - 1 ) % n
    return cnt


#TOFILL
