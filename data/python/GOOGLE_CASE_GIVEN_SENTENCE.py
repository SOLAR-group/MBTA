import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(s):
    n = len(s)
    s1 = ""
    s1 = s1 + s[0].lower()
    i = 1
    while i < n:
        if (s[i] == ' ' and i <= n):
            s1 = s1 + " " + (s[i + 1]).lower()
            i = i + 1
        else:
            s1 = s1 + (s[i]).upper()
        i = i + 1
    return s1


#TOFILL
