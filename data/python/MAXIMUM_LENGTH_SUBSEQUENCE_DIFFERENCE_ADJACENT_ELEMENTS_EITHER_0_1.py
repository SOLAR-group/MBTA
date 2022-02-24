import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(arr, n):
    mls = []
    max = 0
    for i in range(n):
        mls.append(1)
    for i in range(n):
        for j in range(i):
            if (abs(arr[i] - arr[j]) <= 1 and mls[i] < mls[j] + 1):
                mls[i] = mls[j] + 1
    for i in range(n):
        if (max < mls[i]):
            max = mls[i]
    return max


#TOFILL
