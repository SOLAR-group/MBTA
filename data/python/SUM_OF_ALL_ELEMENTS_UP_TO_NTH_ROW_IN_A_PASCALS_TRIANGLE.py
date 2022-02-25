import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    sum = 0
    for row in range ( n ) :
        sum = sum + ( 1 << row )
    return sum


#TOFILL
if __name__ == '__main__':
    param = [
    (21,),
    (4,),
    (31,),
    (79,),
    (38,),
    (75,),
    (36,),
    (32,),
    (23,),
    (65,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_OF_ALL_ELEMENTS_UP_TO_NTH_ROW_IN_A_PASCALS_TRIANGLE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_OF_ALL_ELEMENTS_UP_TO_NTH_ROW_IN_A_PASCALS_TRIANGLE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
