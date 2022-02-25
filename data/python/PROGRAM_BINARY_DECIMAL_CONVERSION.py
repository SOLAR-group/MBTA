import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    num = n ;
    dec_value = 0 ;
    base = 1 ;
    temp = num ;
    while ( temp ) :
        last_digit = temp % 10 ;
        temp = int ( temp / 10 ) ;
        dec_value += last_digit * base ;
        base = base * 2 ;
    return dec_value ;


#TOFILL
if __name__ == '__main__':
    param = [
    (70,),
    (95,),
    (41,),
    (97,),
    (8,),
    (16,),
    (41,),
    (57,),
    (81,),
    (78,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_BINARY_DECIMAL_CONVERSION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_BINARY_DECIMAL_CONVERSION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
