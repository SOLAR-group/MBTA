import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(arr, n, x):
    i = 0
    while (i <= n - 1):
        if (arr[i] == x):
            return i
        i += abs(arr[i] - x)
    return - 1


#TOFILL
