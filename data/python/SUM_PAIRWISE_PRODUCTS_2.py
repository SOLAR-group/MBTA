import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return n * ( n + 1 ) * ( n + 2 ) * ( 3 * n + 1 ) / 24


#TOFILL
if __name__ == '__main__':
    param = [
    (57,),
    (18,),
    (97,),
    (9,),
    (42,),
    (67,),
    (71,),
    (66,),
    (69,),
    (18,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_PAIRWISE_PRODUCTS_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_PAIRWISE_PRODUCTS_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
