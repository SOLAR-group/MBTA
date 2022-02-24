import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(k):
    cur = int((k * (k - 1)) + 1)
    sum = 0
    while k:
        sum += cur
        cur += 2
        k = k - 1
    return sum


#TOFILL
