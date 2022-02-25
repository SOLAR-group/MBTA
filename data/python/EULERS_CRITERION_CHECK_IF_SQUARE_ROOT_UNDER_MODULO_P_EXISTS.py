import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , p ) :
    n = n % p
    for x in range ( 2 , p , 1 ) :
        if ( ( x * x ) % p == n ) :
            return True
    return False


#TOFILL
if __name__ == '__main__':
    param = [
    (71,78,),
    (85,75,),
    (4,35,),
    (20,99,),
    (71,29,),
    (72,88,),
    (36,54,),
    (95,52,),
    (83,33,),
    (72,13,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("EULERS_CRITERION_CHECK_IF_SQUARE_ROOT_UNDER_MODULO_P_EXISTS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("EULERS_CRITERION_CHECK_IF_SQUARE_ROOT_UNDER_MODULO_P_EXISTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
