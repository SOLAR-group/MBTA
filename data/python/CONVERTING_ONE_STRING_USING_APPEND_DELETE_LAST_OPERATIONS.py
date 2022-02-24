import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(str1, str2, k):
    if ((len(str1) + len(str2)) < k):
        return True
    commonLength = 0
    for i in range(0, min(len(str1), len(str2)), 1):
        if (str1[i] == str2[i]):
            commonLength += 1
        else:
            break
    if ((k - len(str1) - len(str2) + 2 * commonLength) % 2 == 0):
        return True
    return False


#TOFILL
