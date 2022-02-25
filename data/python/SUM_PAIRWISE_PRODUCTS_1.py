import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    multiTerms = n * ( n + 1 ) // 2
    sm = multiTerms
    for i in range ( 2 , n + 1 ) :
        multiTerms = multiTerms - ( i - 1 )
        sm = sm + multiTerms * i
    return sm


#TOFILL
if __name__ == '__main__':
    param = [
    (41,),
    (50,),
    (67,),
    (18,),
    (60,),
    (6,),
    (27,),
    (46,),
    (50,),
    (20,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_PAIRWISE_PRODUCTS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_PAIRWISE_PRODUCTS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
