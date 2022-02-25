import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num ) :
    sum = 0
    i = 2
    while ( i * i <= num ) :
        while ( num % i == 0 ) :
            sum += i
            num /= i
        i += 1
    sum += num
    return sum


#TOFILL
if __name__ == '__main__':
    param = [
    (83,),
    (88,),
    (60,),
    (6,),
    (26,),
    (98,),
    (38,),
    (90,),
    (76,),
    (66,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_MINIMUM_SUM_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_MINIMUM_SUM_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
