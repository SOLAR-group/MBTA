# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num ) :
    sum = 0
    i = 2
    while ( i * i <= num ) :
        while ( num % i == 0 ) :
            sum += i
            num /= i
        i += 1
    sum += num
    return sum


#TOFILL
