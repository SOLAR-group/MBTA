import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math


def f_gold(N):
    return math.ceil(math.log2(N + 1)) - 1


#TOFILL
if __name__ == '__main__':
    param = [
        (65,),
        (94,),
        (52,),
        (31,),
        (9,),
        (1,),
        (41,),
        (98,),
        (45,),
        (24,)
    ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("HEIGHT_COMPLETE_BINARY_TREE_HEAP_N_NODES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("HEIGHT_COMPLETE_BINARY_TREE_HEAP_N_NODES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
