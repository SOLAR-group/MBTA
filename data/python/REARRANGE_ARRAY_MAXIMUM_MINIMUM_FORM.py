# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    temp = n * [ None ]
    small , large = 0 , n - 1
    flag = True
    for i in range ( n ) :
        if flag is True :
            temp [ i ] = arr [ large ]
            large -= 1
        else :
            temp [ i ] = arr [ small ]
            small += 1
        flag = bool ( 1 - flag )
    for i in range ( n ) :
        arr [ i ] = temp [ i ]
    return arr


#TOFILL
