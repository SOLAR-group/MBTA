# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    s = [ ]
    j = 0
    ans = 0
    for i in range ( n ) :
        while ( j < n and ( arr [ j ] not in s ) ) :
            s.append ( arr [ j ] )
            j += 1
        ans += ( ( j - i ) * ( j - i + 1 ) ) // 2
        s.remove ( arr [ i ] )
    return ans


#TOFILL
