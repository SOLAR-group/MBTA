import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x ) :
    m = 1 ;
    while ( x & m ) :
        x = x ^ m
        m <<= 1
    x = x ^ m
    return x


#TOFILL
if __name__ == '__main__':
    param = [
    (96,),
    (66,),
    (67,),
    (13,),
    (75,),
    (78,),
    (1,),
    (83,),
    (27,),
    (65,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("ADD_1_TO_A_GIVEN_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("ADD_1_TO_A_GIVEN_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
