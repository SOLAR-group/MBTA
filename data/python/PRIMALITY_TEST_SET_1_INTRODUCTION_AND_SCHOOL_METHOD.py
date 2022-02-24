import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if n <= 1 :
        return False
    for i in range ( 2 , n ) :
        if n % i == 0 :
            return False ;
    return True


#TOFILL
