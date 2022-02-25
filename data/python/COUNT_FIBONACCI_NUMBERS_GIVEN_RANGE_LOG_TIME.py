import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( low , high ) :
    f1 , f2 , f3 = 0 , 1 , 1
    result = 0
    while ( f1 <= high ) :
        if ( f1 >= low ) :
            result += 1
        f1 = f2
        f2 = f3
        f3 = f1 + f2
    return result


#TOFILL
if __name__ == '__main__':
    param = [
    (76,43,),
    (96,52,),
    (19,79,),
    (36,2,),
    (60,11,),
    (20,15,),
    (76,4,),
    (63,93,),
    (2,25,),
    (41,39,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_FIBONACCI_NUMBERS_GIVEN_RANGE_LOG_TIME," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_FIBONACCI_NUMBERS_GIVEN_RANGE_LOG_TIME," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
