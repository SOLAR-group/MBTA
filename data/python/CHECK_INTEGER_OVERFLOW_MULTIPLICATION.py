import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    if ( a == 0 or b == 0 ) :
        return False
    result = a * b
    if ( result >= 9223372036854775807 or result <= - 9223372036854775808 ) :
        result = 0
    if ( a == ( result // b ) ) :
        print ( result // b )
        return False
    else :
        return True


#TOFILL
