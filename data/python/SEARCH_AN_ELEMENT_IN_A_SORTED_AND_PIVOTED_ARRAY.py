import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(arr, l, h, key):
    if l > h:
        return - 1
    mid = (l + h) // 2
    if arr[mid] == key:
        return mid
    if arr[l] <= arr[mid]:
        if key >= arr[l] and key <= arr[mid]:
            return f_gold(arr, l, mid - 1, key)
        return f_gold(arr, mid + 1, h, key)
    if key >= arr[mid] and key <= arr[h]:
        return f_gold(a, mid + 1, h, key)
    return f_gold(arr, l, mid - 1, key)


#TOFILL
