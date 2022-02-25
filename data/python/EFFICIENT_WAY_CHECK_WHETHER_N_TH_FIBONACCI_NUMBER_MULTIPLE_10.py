import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return ( n % 15 == 0 )


#TOFILL
if __name__ == '__main__':
    param = [
    (30,),
    (-30,),
    (60,),
    (90,),
    (99,),
    (32,),
    (21,),
    (65,),
    (21,),
    (99,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("EFFICIENT_WAY_CHECK_WHETHER_N_TH_FIBONACCI_NUMBER_MULTIPLE_10," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("EFFICIENT_WAY_CHECK_WHETHER_N_TH_FIBONACCI_NUMBER_MULTIPLE_10," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
