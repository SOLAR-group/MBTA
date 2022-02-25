import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import itertools

def f_gold ( n ) :
    count = 0
    for curr in itertools.count ( ) :
        sum = 0
        x = curr
        while ( x ) :
            sum = sum + x % 10
            x = x // 10
        if ( sum == 10 ) :
            count = count + 1
        if ( count == n ) :
            return curr
    return - 1


#TOFILL
if __name__ == '__main__':
    param = [
    (37,),
    (13,),
    (51,),
    (69,),
    (76,),
    (10,),
    (97,),
    (40,),
    (69,),
    (4,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
