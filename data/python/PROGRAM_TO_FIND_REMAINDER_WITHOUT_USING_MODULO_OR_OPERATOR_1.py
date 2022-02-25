import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num , divisor ) :
    if ( divisor == 0 ) :
        return False
    if ( divisor < 0 ) :
        divisor = - divisor
    if ( num < 0 ) :
        num = - num
    i = 1
    product = 0
    while ( product <= num ) :
        product = divisor * i
        i += 1
    return num - ( product - divisor )


#TOFILL
if __name__ == '__main__':
    param = [
    (34,55,),
    (63,22,),
    (15,26,),
    (56,58,),
    (63,94,),
    (28,45,),
    (54,97,),
    (2,58,),
    (94,91,),
    (82,40,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
