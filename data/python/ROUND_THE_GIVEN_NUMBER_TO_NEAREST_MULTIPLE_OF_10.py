import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    a = ( n // 10 ) * 10
    b = a + 10
    return ( b if n - a > b - n else a )


#TOFILL
if __name__ == '__main__':
    param = [
    (31,),
    (78,),
    (19,),
    (36,),
    (77,),
    (94,),
    (86,),
    (16,),
    (95,),
    (2,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("ROUND_THE_GIVEN_NUMBER_TO_NEAREST_MULTIPLE_OF_10," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("ROUND_THE_GIVEN_NUMBER_TO_NEAREST_MULTIPLE_OF_10," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
