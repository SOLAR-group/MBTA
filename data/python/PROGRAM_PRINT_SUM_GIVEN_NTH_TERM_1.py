import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    return math.pow ( n , 2 )


#TOFILL
if __name__ == '__main__':
    param = [
    (42,),
    (40,),
    (67,),
    (73,),
    (18,),
    (16,),
    (74,),
    (33,),
    (92,),
    (22,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
