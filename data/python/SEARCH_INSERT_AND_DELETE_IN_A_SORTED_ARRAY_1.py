# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , key , capacity ) :
    if ( n >= capacity ) :
        return n
    i = n - 1
    while i >= 0 and arr [ i ] > key :
        arr [ i + 1 ] = arr [ i ]
        i -= 1
    arr [ i + 1 ] = key
    return ( n + 1 )


#TOFILL
