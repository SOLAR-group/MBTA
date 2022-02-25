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
if __name__ == '__main__':
    param = [
        (67,),
        (48,),
        (59,),
        (22,),
        (14,),
        (66,),
        (1,),
        (75,),
        (58,),
        (78,)
    ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
