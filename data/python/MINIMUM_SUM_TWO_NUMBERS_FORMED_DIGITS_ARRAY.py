# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    arr.sort ( )
    a = 0 ; b = 0
    for i in range ( n ) :
        if ( i % 2 != 0 ) :
            a = a * 10 + arr [ i ]
        else :
            b = b * 10 + arr [ i ]
    return a + b


#TOFILL
