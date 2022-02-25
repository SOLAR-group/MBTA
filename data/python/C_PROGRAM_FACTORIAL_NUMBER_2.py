import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return 1 if ( n == 1 or n == 0 ) else n * f_gold ( n - 1 )


#TOFILL
if __name__ == '__main__':
    param = [
    (66,),
    (93,),
    (39,),
    (93,),
    (68,),
    (20,),
    (37,),
    (52,),
    (52,),
    (19,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("C_PROGRAM_FACTORIAL_NUMBER_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("C_PROGRAM_FACTORIAL_NUMBER_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
