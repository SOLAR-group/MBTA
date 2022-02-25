import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    return 0.0246 * ( math.pow ( 10 , n ) - 1 - ( 9 * n ) )


#TOFILL
if __name__ == '__main__':
    param = [
    (88,),
    (79,),
    (7,),
    (36,),
    (23,),
    (10,),
    (27,),
    (30,),
    (71,),
    (6,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_SEQUENCE_2_22_222," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_SEQUENCE_2_22_222," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
