# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    res = 1
    for i in range ( 0 , n ) :
        if arr [ i ] <= res :
            res = res + arr [ i ]
        else :
            break
    return res


#TOFILL
