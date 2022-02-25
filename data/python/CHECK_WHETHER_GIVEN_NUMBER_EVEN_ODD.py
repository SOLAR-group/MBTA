import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return ( n % 2 == 0 )


#TOFILL
if __name__ == '__main__':
    param = [
    (67,),
    (90,),
    (55,),
    (90,),
    (83,),
    (32,),
    (58,),
    (38,),
    (87,),
    (87,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
