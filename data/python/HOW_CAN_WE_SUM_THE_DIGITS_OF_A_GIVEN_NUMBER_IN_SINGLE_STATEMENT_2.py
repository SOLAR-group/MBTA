import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( no ) :
    return 0 if no == 0 else int ( no % 10 ) + f_gold ( int ( no / 10 ) )


#TOFILL
if __name__ == '__main__':
    param = [
    (73,),
    (91,),
    (27,),
    (79,),
    (31,),
    (84,),
    (68,),
    (9,),
    (85,),
    (35,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("HOW_CAN_WE_SUM_THE_DIGITS_OF_A_GIVEN_NUMBER_IN_SINGLE_STATEMENT_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("HOW_CAN_WE_SUM_THE_DIGITS_OF_A_GIVEN_NUMBER_IN_SINGLE_STATEMENT_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
