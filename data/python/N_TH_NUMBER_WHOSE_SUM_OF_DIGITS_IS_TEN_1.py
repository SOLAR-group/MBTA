import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    count = 0 ;
    curr = 19 ;
    while ( True ) :
        sum = 0 ;
        x = curr ;
        while ( x > 0 ) :
            sum = sum + x % 10 ;
            x = int ( x / 10 ) ;
        if ( sum == 10 ) :
            count += 1 ;
        if ( count == n ) :
            return curr ;
        curr += 9 ;
    return - 1 ;


#TOFILL
if __name__ == '__main__':
    param = [
    (93,),
    (10,),
    (55,),
    (94,),
    (2,),
    (5,),
    (37,),
    (4,),
    (11,),
    (46,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
