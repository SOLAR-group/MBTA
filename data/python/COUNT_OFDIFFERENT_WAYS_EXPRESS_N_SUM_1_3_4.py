import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    DP = [ 0 for i in range ( 0 , n + 1 ) ]
    DP [ 0 ] = DP [ 1 ] = DP [ 2 ] = 1
    DP [ 3 ] = 2
    for i in range ( 4 , n + 1 ) :
        DP [ i ] = DP [ i - 1 ] + DP [ i - 3 ] + DP [ i - 4 ]
    return DP [ n ]


#TOFILL
if __name__ == '__main__':
    param = [
    (44,),
    (9,),
    (19,),
    (10,),
    (78,),
    (94,),
    (70,),
    (81,),
    (81,),
    (49,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_OFDIFFERENT_WAYS_EXPRESS_N_SUM_1_3_4," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_OFDIFFERENT_WAYS_EXPRESS_N_SUM_1_3_4," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
