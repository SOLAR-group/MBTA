import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if ( n == 0 ) :
        return False
    while ( n != 1 ) :
        if ( n % 4 != 0 ) :
            return False
        n = n // 4
    return True


#TOFILL
if __name__ == '__main__':
    param = [
    (45,),
    (16,),
    (15,),
    (91,),
    (82,),
    (18,),
    (31,),
    (6,),
    (93,),
    (35,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
