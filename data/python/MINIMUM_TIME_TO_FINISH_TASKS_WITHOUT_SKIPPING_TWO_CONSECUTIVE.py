import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(arr, n):
    if (n <= 0):
        return 0
    incl = arr[0]
    excl = 0
    for i in range(1, n):
        incl_new = arr[i] + min(excl, incl)
        excl_new = incl
        incl = incl_new
        excl = excl_new
    return min(incl, excl)


#TOFILL
