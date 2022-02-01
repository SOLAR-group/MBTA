# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(arr, n):
    hash = dict()
    maximum = 0
    for i in arr:
        if (i < 0):
            if abs(i) not in hash.keys():
                hash[abs(i)] = - 1
            else:
                hash[abs(i)] -= 1
        else:
            hash[i] = hash.get(i, 0) + 1
    for i in arr:
        if i in hash.keys() and hash[i] > 0:
            return i
    return - 1


#TOFILL
