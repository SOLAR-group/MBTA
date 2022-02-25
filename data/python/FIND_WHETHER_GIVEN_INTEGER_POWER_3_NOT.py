import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return 1162261467 % n == 0


#TOFILL
if __name__ == '__main__':
    param = [
    (1,),
    (3,),
    (27,),
    (9,),
    (-9,),
    (11,),
    (57,),
    (21,),
    (60,),
    (44,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_WHETHER_GIVEN_INTEGER_POWER_3_NOT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_WHETHER_GIVEN_INTEGER_POWER_3_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
