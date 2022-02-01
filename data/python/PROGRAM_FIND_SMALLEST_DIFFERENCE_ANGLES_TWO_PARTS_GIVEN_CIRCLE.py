# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    l = 0
    _sum = 0
    ans = 360
    for i in range ( n ) :
        _sum += arr [ i ]
        while _sum >= 180 :
            ans = min ( ans , 2 * abs ( 180 - _sum ) )
            _sum -= arr [ l ]
            l += 1
        ans = min ( ans , 2 * abs ( 180 - _sum ) )
    return ans


#TOFILL
