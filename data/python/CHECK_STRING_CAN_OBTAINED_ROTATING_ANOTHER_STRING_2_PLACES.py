# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str1 , str2 ) :
    if ( len ( str1 ) != len ( str2 ) ) :
        return False
    clock_rot = ""
    anticlock_rot = ""
    l = len ( str2 )
    anticlock_rot = ( anticlock_rot + str2 [ l - 2 : ] + str2 [ 0 : l - 2 ] )
    clock_rot = clock_rot + str2 [ 2 : ] + str2 [ 0 : 2 ]
    return ( str1 == clock_rot or str1 == anticlock_rot )


#TOFILL
