import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x ) :
    i = 1 ;
    fact = 1 ;
    for i in range ( 1 , x ) :
        fact = fact * i
        if ( fact % x == 0 ) :
            break
    return i


#TOFILL
if __name__ == '__main__':
    param = [
    (67,),
    (47,),
    (57,),
    (89,),
    (67,),
    (40,),
    (16,),
    (83,),
    (93,),
    (43,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_FIRST_NATURAL_NUMBER_WHOSE_FACTORIAL_DIVISIBLE_X," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_FIRST_NATURAL_NUMBER_WHOSE_FACTORIAL_DIVISIBLE_X," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
