# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    result = 0
    rem = 0
    if ( a < b ) :
        a , b = b , a
    while ( b > 0 ) :
        result += int ( a / b )
        rem = int ( a % b )
        a = b
        b = rem
    return result


#TOFILL
