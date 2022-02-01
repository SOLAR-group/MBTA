# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    a = ( n // 10 ) * 10
    b = a + 10
    return ( b if n - a > b - n else a )


#TOFILL
