# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , n ) :
    count = 0
    for i in range ( 0 , n ) :
        for j in range ( i + 1 , n ) :
            if ( a [ i ] & a [ j ] ) == 0 :
                count += 2
    return count


#TOFILL
