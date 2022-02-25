import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , k ) :
    dp = [ [ 0 for i in range ( k + 1 ) ] for j in range ( n + 1 ) ]
    for i in range ( n + 1 ) :
        dp [ i ] [ 0 ] = 0
    for i in range ( k + 1 ) :
        dp [ 0 ] [ k ] = 0
    for i in range ( 1 , n + 1 ) :
        for j in range ( 1 , k + 1 ) :
            if ( j == 1 or i == j ) :
                dp [ i ] [ j ] = 1
            else :
                dp [ i ] [ j ] = ( j * dp [ i - 1 ] [ j ] + dp [ i - 1 ] [ j - 1 ] )
    return dp [ n ] [ k ]


#TOFILL
if __name__ == '__main__':
    param = [
    (84,99,),
    (95,64,),
    (67,21,),
    (92,22,),
    (97,35,),
    (13,77,),
    (37,46,),
    (9,92,),
    (10,26,),
    (90,94,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_NUMBER_OF_WAYS_TO_PARTITION_A_SET_INTO_K_SUBSETS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_NUMBER_OF_WAYS_TO_PARTITION_A_SET_INTO_K_SUBSETS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
