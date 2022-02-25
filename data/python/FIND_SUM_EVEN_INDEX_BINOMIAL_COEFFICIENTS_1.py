import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return ( 1 << ( n - 1 ) )


#TOFILL
if __name__ == '__main__':
    param = [
    (56,),
    (28,),
    (4,),
    (24,),
    (72,),
    (30,),
    (48,),
    (32,),
    (13,),
    (19,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
