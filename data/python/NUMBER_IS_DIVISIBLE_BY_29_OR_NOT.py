# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    while ( int ( n / 100 ) ) :
        last_digit = int ( n % 10 )
        n = int ( n / 10 )
        n += last_digit * 3
    return ( n % 29 == 0 )


#TOFILL
