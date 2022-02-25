import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    dp = [ 0 ] * ( n + 1 )
    dp [ 0 ] = 0
    dp [ 1 ] = 1
    for i in range ( 2 , n + 1 ) :
        dp [ i ] = max ( dp [ int ( i / 2 ) ] + dp [ int ( i / 3 ) ] + dp [ int ( i / 4 ) ] , i ) ;
    return dp [ n ]


#TOFILL
if __name__ == '__main__':
    param = [
    (50,),
    (83,),
    (18,),
    (24,),
    (31,),
    (38,),
    (94,),
    (24,),
    (13,),
    (53,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
