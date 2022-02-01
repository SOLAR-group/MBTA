# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(n):
    k = n
    imin = 1
    ans = 0
    while (imin <= n):
        imax = n / k
        ans += k * (imax - imin + 1)
        imin = imax + 1
        k = n / imin
    return ans


#TOFILL
