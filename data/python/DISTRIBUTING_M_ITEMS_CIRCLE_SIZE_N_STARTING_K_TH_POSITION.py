# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , m , k ) :
    if ( m <= n - k + 1 ) :
        return m + k - 1
    m = m - ( n - k + 1 )
    if ( m % n == 0 ) :
        return n
    else :
        return m % n


#TOFILL
