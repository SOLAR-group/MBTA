import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    for i in range ( 0 , len ( str ) ) :
        if ( str [ i ].istitle ( ) ) :
            return str [ i ]
    return 0


#TOFILL
