import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(arr, n, k):
    for i in range(n - 1):
        pos = i
        for j in range(i + 1, n):
            if (j - i > k):
                break
            if (arr[j] < arr[pos]):
                pos = j
        for j in range(pos, i, - 1):
            arr[j], arr[j - 1] = arr[j - 1], arr[j]
        k -= pos - i


#TOFILL
