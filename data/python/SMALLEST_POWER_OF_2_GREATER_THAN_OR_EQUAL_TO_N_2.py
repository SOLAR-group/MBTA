import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    n -= 1
    n |= n >> 1
    n |= n >> 2
    n |= n >> 4
    n |= n >> 8
    n |= n >> 16
    n += 1
    return n


#TOFILL
if __name__ == '__main__':
    param = [
    (60,),
    (20,),
    (33,),
    (34,),
    (68,),
    (79,),
    (20,),
    (41,),
    (36,),
    (17,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
