import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( A , B , n ) :
    sorted ( A )
    sorted ( B )
    result = 0
    for i in range ( n ) :
        result += ( A [ i ] * B [ n - i - 1 ] )
    return result


#TOFILL
