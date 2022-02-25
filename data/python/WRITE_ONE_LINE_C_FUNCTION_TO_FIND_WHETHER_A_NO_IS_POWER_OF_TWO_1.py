import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x ) :
    return ( x and ( not ( x & ( x - 1 ) ) ) )


#TOFILL
if __name__ == '__main__':
    param = [
    (1,),
    (2,),
    (8,),
    (1024,),
    (24,),
    (7,),
    (46,),
    (61,),
    (73,),
    (66,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("WRITE_ONE_LINE_C_FUNCTION_TO_FIND_WHETHER_A_NO_IS_POWER_OF_TWO_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("WRITE_ONE_LINE_C_FUNCTION_TO_FIND_WHETHER_A_NO_IS_POWER_OF_TWO_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
