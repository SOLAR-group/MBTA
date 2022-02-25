import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    nthElement = 19 + ( n - 1 ) * 9
    outliersCount = int ( math.log10 ( nthElement ) ) - 1
    nthElement += 9 * outliersCount
    return nthElement


#TOFILL
if __name__ == '__main__':
    param = [
    (68,),
    (70,),
    (69,),
    (93,),
    (99,),
    (44,),
    (91,),
    (8,),
    (83,),
    (51,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
