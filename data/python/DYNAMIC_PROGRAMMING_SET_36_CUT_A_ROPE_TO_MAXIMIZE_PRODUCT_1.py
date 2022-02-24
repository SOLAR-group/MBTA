import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(n):
    if (n == 2 or n == 3):
        return (n - 1)
    res = 1
    while (n > 4):
        n -= 3
        res *= 3
    return (n * res)


#TOFILL
