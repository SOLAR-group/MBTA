# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , x ) :
    for i in arr :
        for j in arr :
            if i * j == x :
                return True
    return False


#TOFILL
