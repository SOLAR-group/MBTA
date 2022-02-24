import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( array , start , end ) :
    if ( start > end ) :
        return end + 1
    if ( start != array [ start ] ) :
        return start ;
    mid = int ( ( start + end ) / 2 )
    if ( array [ mid ] == mid ) :
        return f_gold ( array , mid + 1 , end )
    return f_gold ( array , start , mid )


#TOFILL
