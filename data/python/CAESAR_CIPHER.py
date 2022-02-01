# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( text , s ) :
    result = ""
    for i in range ( len ( text ) ) :
        char = text [ i ]
        if ( char.isupper ( ) ) :
            result += chr ( ( ord ( char ) + s - 65 ) % 26 + 65 )
        else :
            result += chr ( ( ord ( char ) + s - 97 ) % 26 + 97 )
    return result


#TOFILL
