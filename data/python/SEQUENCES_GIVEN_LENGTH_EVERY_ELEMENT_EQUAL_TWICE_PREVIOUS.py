import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(m, n):
    if m < n:
        return 0
    if n == 0:
        return 1
    res = (f_gold(m - 1, n) + f_gold(m // 2, n - 1))
    return res


#TOFILL
