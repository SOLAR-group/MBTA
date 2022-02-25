import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( dist ) :
    count = [ 0 ] * ( dist + 1 )
    count [ 0 ] = 1
    count [ 1 ] = 1
    count [ 2 ] = 2
    for i in range ( 3 , dist + 1 ) :
        count [ i ] = ( count [ i - 1 ] + count [ i - 2 ] + count [ i - 3 ] )
    return count [ dist ] ;


#TOFILL
if __name__ == '__main__':
    param = [
    (37,),
    (82,),
    (87,),
    (80,),
    (92,),
    (58,),
    (98,),
    (53,),
    (11,),
    (58,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_NUMBER_OF_WAYS_TO_COVER_A_DISTANCE_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_NUMBER_OF_WAYS_TO_COVER_A_DISTANCE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
