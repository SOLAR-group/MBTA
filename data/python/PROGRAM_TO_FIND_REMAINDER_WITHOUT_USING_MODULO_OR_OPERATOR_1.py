# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num , divisor ) :
    if ( divisor == 0 ) :
        return False
    if ( divisor < 0 ) :
        divisor = - divisor
    if ( num < 0 ) :
        num = - num
    i = 1
    product = 0
    while ( product <= num ) :
        product = divisor * i
        i += 1
    return num - ( product - divisor )


#TOFILL
