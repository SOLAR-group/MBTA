# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , n ) :
    a = sorted ( a )
    num1 , num2 = 0 , 0
    for i in range ( n ) :
        if i % 2 == 0 :
            num1 = num1 * 10 + a [ i ]
        else :
            num2 = num2 * 10 + a [ i ]
    return num2 + num1


#TOFILL
