# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    remainder = 0
    for i in range ( 0 , n ) :
        remainder = ( remainder + arr [ i ] ) % 3
    return ( remainder == 0 )


#TOFILL
