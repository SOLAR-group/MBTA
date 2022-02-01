# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(st):
    for i in range(1, len(st)):
        if (st[i - 1] == 'A' and st[i] == 'B'):
            st[i - 1] = 'C'
            for j in range(i, len(st) - 1):
                st[j] = st[j + 1]
            st[len(st) - 1] = ' '
    return


#TOFILL
