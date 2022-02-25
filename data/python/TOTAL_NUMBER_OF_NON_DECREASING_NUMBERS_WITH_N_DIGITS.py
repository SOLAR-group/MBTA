import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    dp = [ [ 0 for i in range ( n + 1 ) ] for i in range ( 10 ) ]
    for i in range ( 10 ) :
        dp [ i ] [ 1 ] = 1
    for digit in range ( 10 ) :
        for len in range ( 2 , n + 1 ) :
            for x in range ( digit + 1 ) :
                dp [ digit ] [ len ] += dp [ x ] [ len - 1 ]
    count = 0
    for i in range ( 10 ) :
        count += dp [ i ] [ n ]
    return count


#TOFILL
if __name__ == '__main__':
    param = [
    (21,),
    (40,),
    (83,),
    (93,),
    (43,),
    (98,),
    (35,),
    (86,),
    (76,),
    (88,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
