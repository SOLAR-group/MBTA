import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return ( 3.0 * n ) / ( 4.0 * ( n * n ) - 1 )


#TOFILL
if __name__ == '__main__':
    param = [
    (46,),
    (5,),
    (44,),
    (15,),
    (72,),
    (2,),
    (86,),
    (17,),
    (30,),
    (42,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROBABILITY_THREE_RANDOMLY_CHOSEN_NUMBERS_AP," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROBABILITY_THREE_RANDOMLY_CHOSEN_NUMBERS_AP," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
