# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    result = 0
    for i in range ( 1 , 10 ) :
        s = [ ]
        if ( i <= n ) :
            s.append ( i )
            result += 1
        while len ( s ) != 0 :
            tp = s [ - 1 ]
            s.pop ( )
            for j in range ( tp % 10 , 10 ) :
                x = tp * 10 + j
                if ( x <= n ) :
                    s.append ( x )
                    result += 1
    return result


#TOFILL
