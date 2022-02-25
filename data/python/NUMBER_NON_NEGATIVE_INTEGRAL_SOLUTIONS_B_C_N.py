import sys
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
if __name__ == '__main__':
    param = [
    (62,),
    (44,),
    (37,),
    (81,),
    (14,),
    (20,),
    (76,),
    (72,),
    (96,),
    (52,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
