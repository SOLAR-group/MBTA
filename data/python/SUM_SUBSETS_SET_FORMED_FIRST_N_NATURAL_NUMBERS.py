import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return ( n * ( n + 1 ) / 2 ) * ( 1 << ( n - 1 ) )


#TOFILL
if __name__ == '__main__':
    param = [
    (76,),
    (26,),
    (45,),
    (35,),
    (34,),
    (22,),
    (3,),
    (25,),
    (22,),
    (78,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_SUBSETS_SET_FORMED_FIRST_N_NATURAL_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_SUBSETS_SET_FORMED_FIRST_N_NATURAL_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
