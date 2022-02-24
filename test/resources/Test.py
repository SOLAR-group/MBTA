# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x ) :
    m = 1 ;
    while ( x & m ) :
        x = x ^ m
        m <<= 1
    x = x ^ m
    return x


#TOFILL

if __name__ == '__main__':
    TEST_MAIN_0
    n_success = 0
    for i, parameters_set in enumerate(param):
        TEST_FOR_0
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            TEST_FOR_1
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))
