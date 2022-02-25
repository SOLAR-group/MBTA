import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    odd_count = 0
    even_count = 0
    if ( n < 0 ) :
        n = - n
    if ( n == 0 ) :
        return 1
    if ( n == 1 ) :
        return 0
    while ( n ) :
        if ( n & 1 ) :
            odd_count += 1
        if ( n & 2 ) :
            even_count += 1
        n = n >> 2
    return f_gold ( abs ( odd_count - even_count ) )


#TOFILL
if __name__ == '__main__':
    param = [
    (94,),
    (94,),
    (79,),
    (39,),
    (16,),
    (90,),
    (64,),
    (76,),
    (83,),
    (47,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("WRITE_AN_EFFICIENT_METHOD_TO_CHECK_IF_A_NUMBER_IS_MULTIPLE_OF_3," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("WRITE_AN_EFFICIENT_METHOD_TO_CHECK_IF_A_NUMBER_IS_MULTIPLE_OF_3," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
