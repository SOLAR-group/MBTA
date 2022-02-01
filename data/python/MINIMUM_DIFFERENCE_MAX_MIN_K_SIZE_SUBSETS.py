# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , N , K ) :
    arr.sort ( )
    res = 2147483647
    for i in range ( ( N - K ) + 1 ) :
        curSeqDiff = arr [ i + K - 1 ] - arr [ i ]
        res = min ( res , curSeqDiff )
    return res


#TOFILL
