import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( l ) :
    leafNodeCount = math.pow ( 2 , l - 1 ) ;
    sumLastLevel = 0 ;
    sumLastLevel = ( ( leafNodeCount * ( leafNodeCount + 1 ) ) / 2 ) ;
    sum = sumLastLevel * l ;
    return int ( sum ) ;


#TOFILL
if __name__ == '__main__':
    param = [
    (5,),
    (16,),
    (8,),
    (61,),
    (59,),
    (88,),
    (67,),
    (28,),
    (58,),
    (42,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
