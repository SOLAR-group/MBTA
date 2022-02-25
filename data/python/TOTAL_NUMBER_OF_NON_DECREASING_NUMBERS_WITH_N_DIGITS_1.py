import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    N = 10
    count = 1
    for i in range ( 1 , n + 1 ) :
        count = int ( count * ( N + i - 1 ) )
        count = int ( count / i )
    return count


#TOFILL
if __name__ == '__main__':
    param = [
    (40,),
    (11,),
    (94,),
    (73,),
    (6,),
    (73,),
    (58,),
    (40,),
    (64,),
    (66,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
