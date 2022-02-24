import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(arr, n):
    x = sorted(arr)
    count = 1
    for i in range(0, n - 1):
        if (x[i] + 1 != x[i + 1]):
            count = count + 1
    return count


#TOFILL
