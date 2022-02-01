# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( mat , n ) :
    tot_energy = 0
    for i in range ( n ) :
        for j in range ( n ) :
            q = mat [ i ] [ j ] // n
            i_des = q
            j_des = mat [ i ] [ j ] - ( n * q )
            tot_energy += ( abs ( i_des - i ) + abs ( j_des - j ) )
    return tot_energy


#TOFILL
