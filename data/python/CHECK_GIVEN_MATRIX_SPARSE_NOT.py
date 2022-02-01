# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( array , m , n ) :
    counter = 0
    for i in range ( 0 , m ) :
        for j in range ( 0 , n ) :
            if ( array [ i ] [ j ] == 0 ) :
                counter = counter + 1
    return ( counter > ( ( m * n ) // 2 ) )


#TOFILL
