import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import collections

def f_gold ( arr , n ) :
    q = collections.deque ( [ ] )
    arr.sort ( )
    q.append ( arr [ 0 ] )
    for i in range ( 1 , n ) :
        now = q [ 0 ]
        if ( arr [ i ] >= 2 * now ) :
            q.popleft ( )
        q.append ( arr [ i ] )
    return len ( q )


#TOFILL
