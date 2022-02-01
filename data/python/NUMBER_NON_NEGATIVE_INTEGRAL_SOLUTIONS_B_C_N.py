# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    result = 0
    for i in range ( n + 1 ) :
        for j in range ( n + 1 ) :
            for k in range ( n + 1 ) :
                if i + j + k == n :
                    result += 1
    return result


#TOFILL
