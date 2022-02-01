# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( ar , m , n ) :
    even = 0
    odd = 0
    for i in range ( m ) :
        for j in range ( n ) :
            if ( ( ar [ i ] [ j ] % 2 ) == 0 ) :
                even += 1
            else :
                odd += 1
    print ( " Frequency of odd number =" , odd )
    print ( " Frequency of even number =" , even )


#TOFILL
