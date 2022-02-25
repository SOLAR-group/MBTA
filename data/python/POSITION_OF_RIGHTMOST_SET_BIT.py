import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    return math.log2 ( n & - n ) + 1


#TOFILL
if __name__ == '__main__':
    param = [
    (45,),
    (26,),
    (74,),
    (80,),
    (46,),
    (67,),
    (16,),
    (87,),
    (27,),
    (17,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("POSITION_OF_RIGHTMOST_SET_BIT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("POSITION_OF_RIGHTMOST_SET_BIT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
