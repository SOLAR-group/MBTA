import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , p ) :
    if n >= p :
        return 0
    result = 1
    for i in range ( 1 , n + 1 ) :
        result = ( result * i ) % p
    return result


#TOFILL
if __name__ == '__main__':
    param = [
    (85,18,),
    (14,13,),
    (83,21,),
    (30,35,),
    (96,51,),
    (55,58,),
    (82,71,),
    (12,74,),
    (38,3,),
    (46,73,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COMPUTE_N_UNDER_MODULO_P," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COMPUTE_N_UNDER_MODULO_P," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
