import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(a, b):
    count = 0
    p = abs(a * b)
    if (p == 0):
        return 1
    while (p > 0):
        count = count + 1
        p = p // 10
    return count


#TOFILL
