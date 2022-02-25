import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if ( n == 0 ) :
        return "0" ;
    bin = "" ;
    while ( n > 0 ) :
        if ( n & 1 == 0 ) :
            bin = '0' + bin ;
        else :
            bin = '1' + bin ;
        n = n >> 1 ;
    return bin ;


#TOFILL
if __name__ == '__main__':
    param = [
    (35,),
    (17,),
    (8,),
    (99,),
    (57,),
    (39,),
    (99,),
    (14,),
    (22,),
    (7,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("DECIMAL_BINARY_CONVERSION_WITHOUT_USING_ARITHMETIC_OPERATORS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DECIMAL_BINARY_CONVERSION_WITHOUT_USING_ARITHMETIC_OPERATORS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
