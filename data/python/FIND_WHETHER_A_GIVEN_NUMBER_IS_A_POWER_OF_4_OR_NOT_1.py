import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    count = 0
    if ( n and ( not ( n & ( n - 1 ) ) ) ) :
        while ( n > 1 ) :
            n >>= 1
            count += 1
        if ( count % 2 == 0 ) :
            return True
        else :
            return False


#TOFILL
if __name__ == '__main__':
    param = [
    (1,),
    (4,),
    (64,),
    (-64,),
    (128,),
    (1024,),
    (45,),
    (33,),
    (66,),
    (74,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
