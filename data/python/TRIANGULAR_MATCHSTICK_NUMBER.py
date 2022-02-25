import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x ) :
    return ( 3 * x * ( x + 1 ) ) / 2


#TOFILL
if __name__ == '__main__':
    param = [
    (6,),
    (25,),
    (15,),
    (30,),
    (17,),
    (80,),
    (27,),
    (13,),
    (12,),
    (67,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("TRIANGULAR_MATCHSTICK_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TRIANGULAR_MATCHSTICK_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
