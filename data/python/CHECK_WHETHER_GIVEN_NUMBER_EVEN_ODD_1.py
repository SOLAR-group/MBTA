import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return ( not ( n & 1 ) )


#TOFILL
if __name__ == '__main__':
    param = [
    (57,),
    (73,),
    (79,),
    (36,),
    (71,),
    (23,),
    (41,),
    (66,),
    (46,),
    (50,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
