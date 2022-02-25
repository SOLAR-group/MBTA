import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    count = 0 ;
    if ( n and not ( n & ( n - 1 ) ) ) :
        return n
    while ( n != 0 ) :
        n >>= 1
        count += 1
    return 1 << count ;


#TOFILL
if __name__ == '__main__':
    param = [
    (13,),
    (27,),
    (1,),
    (24,),
    (98,),
    (94,),
    (36,),
    (41,),
    (74,),
    (39,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
