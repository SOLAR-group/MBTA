import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( p ) :
    checkNumber = 2 ** p - 1
    nextval = 4 % checkNumber
    for i in range ( 1 , p - 1 ) :
        nextval = ( nextval * nextval - 2 ) % checkNumber
    if ( nextval == 0 ) : return True
    else : return False


#TOFILL
if __name__ == '__main__':
    param = [
    (11,),
    (27,),
    (31,),
    (47,),
    (3,),
    (14,),
    (41,),
    (72,),
    (39,),
    (22,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
