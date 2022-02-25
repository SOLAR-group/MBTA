import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( h ) :
    MOD = 1000000007
    dp = [ 0 for i in range ( h + 1 ) ]
    dp [ 0 ] = 1
    dp [ 1 ] = 1
    for i in range ( 2 , h + 1 ) :
        dp [ i ] = ( dp [ i - 1 ] * ( ( 2 * dp [ i - 2 ] ) % MOD + dp [ i - 1 ] ) % MOD ) % MOD
    return dp [ h ]


#TOFILL
if __name__ == '__main__':
    param = [
    (75,),
    (50,),
    (93,),
    (87,),
    (35,),
    (25,),
    (43,),
    (61,),
    (54,),
    (91,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_BALANCED_BINARY_TREES_HEIGHT_H," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_BALANCED_BINARY_TREES_HEIGHT_H," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
