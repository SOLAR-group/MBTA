import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    count = 0
    i = 5
    while ( n / i >= 1 ) :
        count += int ( n / i )
        i *= 5
    return int ( count )


#TOFILL
