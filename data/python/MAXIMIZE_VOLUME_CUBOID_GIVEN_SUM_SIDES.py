import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(s):
    maxvalue = 0
    i = 1
    for i in range(s - 1):
        j = 1
        for j in range(s):
            k = s - i - j
            maxvalue = max(maxvalue, i * j * k)
    return maxvalue


#TOFILL
