import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import sys


def f_gold(A, B, m, n):
    A.sort()
    B.sort()
    a = 0
    b = 0
    result = sys.maxsize
    while (a < m and b < n):
        if (abs(A[a] - B[b]) < result):
            result = abs(A[a] - B[b])
        if (A[a] < B[b]):
            a += 1
        else:
            b += 1
    return result


#TOFILL
