import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    result = ""
    v = True
    for i in range ( len ( str ) ) :
        if ( str [ i ] == ' ' ) :
            v = True
        elif ( str [ i ] != ' ' and v == True ) :
            result += ( str [ i ] )
            v = False
    return result


#TOFILL
