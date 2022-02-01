# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , arr_size ) :
    lo = 0
    hi = arr_size - 1
    mid = 0
    while mid <= hi :
        if a [ mid ] == 0 :
            a [ lo ] , a [ mid ] = a [ mid ] , a [ lo ]
            lo = lo + 1
            mid = mid + 1
        elif a [ mid ] == 1 :
            mid = mid + 1
        else :
            a [ mid ] , a [ hi ] = a [ hi ] , a [ mid ]
            hi = hi - 1


#TOFILL
