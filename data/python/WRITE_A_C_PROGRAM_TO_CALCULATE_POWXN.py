import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x , y ) :
    if ( y == 0 ) : return 1
    elif ( int ( y % 2 ) == 0 ) :
        return ( f_gold ( x , int ( y / 2 ) ) * f_gold ( x , int ( y / 2 ) ) )
    else :
        return ( x * f_gold ( x , int ( y / 2 ) ) * f_gold ( x , int ( y / 2 ) ) )


#TOFILL
