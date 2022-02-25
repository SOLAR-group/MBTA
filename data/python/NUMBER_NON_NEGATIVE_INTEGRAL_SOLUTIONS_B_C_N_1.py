import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return int ( ( ( n + 1 ) * ( n + 2 ) ) / 2 )


#TOFILL
if __name__ == '__main__':
    param = [
    (41,),
    (72,),
    (54,),
    (75,),
    (87,),
    (41,),
    (78,),
    (80,),
    (46,),
    (9,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
