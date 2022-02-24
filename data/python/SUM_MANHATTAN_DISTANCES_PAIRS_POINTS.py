import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(x, y, n):
    sum = 0
    for i in range(n):
        for j in range(i + 1, n):
            sum += (abs(x[i] - x[j]) + abs(y[i] - y[j]))
    return sum


#TOFILL
