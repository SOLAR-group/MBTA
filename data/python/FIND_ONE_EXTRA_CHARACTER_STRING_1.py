# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( strA , strB ) :
    res = 0
    for i in range ( 0 , len ( strA ) ) :
        res = res ^ ( ord ) ( strA [ i ] )
    for i in range ( 0 , len ( strB ) ) :
        res = res ^ ( ord ) ( strB [ i ] )
    return ( ( chr ) ( res ) ) ;


#TOFILL
