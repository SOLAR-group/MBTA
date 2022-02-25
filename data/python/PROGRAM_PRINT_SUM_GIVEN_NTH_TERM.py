import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    S = 0
    for i in range ( 1 , n + 1 ) :
        S += i * i - ( i - 1 ) * ( i - 1 )
    return S


#TOFILL
if __name__ == '__main__':
    param = [
    (39,),
    (20,),
    (10,),
    (39,),
    (70,),
    (21,),
    (21,),
    (80,),
    (89,),
    (99,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
