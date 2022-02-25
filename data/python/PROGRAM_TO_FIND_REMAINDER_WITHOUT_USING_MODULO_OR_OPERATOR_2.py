import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num , divisor ) :
    while ( num >= divisor ) :
        num -= divisor ;
    return num ;


#TOFILL
if __name__ == '__main__':
    param = [
    (70,13,),
    (77,3,),
    (77,73,),
    (88,54,),
    (96,39,),
    (6,10,),
    (79,95,),
    (44,32,),
    (26,86,),
    (82,91,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
