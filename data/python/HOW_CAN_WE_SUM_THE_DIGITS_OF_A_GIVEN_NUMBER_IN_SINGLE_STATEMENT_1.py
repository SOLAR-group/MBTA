# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    sum = 0
    while ( n > 0 ) :
        sum += int ( n % 10 )
        n = int ( n / 10 )
    return sum


#TOFILL