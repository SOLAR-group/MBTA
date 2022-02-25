import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    res = 1
    while n % 2 == 0 :
        n = n // 2
    for i in range ( 3 , int ( math.sqrt ( n ) + 1 ) ) :
        count = 0
        curr_sum = 1
        curr_term = 1
        while n % i == 0 :
            count += 1
            n = n // i
            curr_term *= i
            curr_sum += curr_term
        res *= curr_sum
    if n >= 2 :
        res *= ( 1 + n )
    return res


#TOFILL
if __name__ == '__main__':
    param = [
    (20,),
    (6,),
    (39,),
    (80,),
    (88,),
    (7,),
    (16,),
    (27,),
    (83,),
    (6,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_SUM_ODD_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_SUM_ODD_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
