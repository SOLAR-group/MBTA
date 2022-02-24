import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( A , B ) :
    variable = 1
    if ( A == B ) :
        return 1
    elif ( ( B - A ) >= 5 ) :
        return 0
    else :
        for i in range ( A + 1 , B + 1 ) :
            variable = ( variable * ( i % 10 ) ) % 10
        return variable % 10


#TOFILL
