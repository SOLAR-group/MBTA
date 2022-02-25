import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( process , need ) :
    minResources = 0
    minResources = process * ( need - 1 ) + 1
    return minResources


#TOFILL
if __name__ == '__main__':
    param = [
    (38,37,),
    (82,3,),
    (2,26,),
    (38,72,),
    (31,85,),
    (80,73,),
    (11,9,),
    (2,31,),
    (26,59,),
    (37,67,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
