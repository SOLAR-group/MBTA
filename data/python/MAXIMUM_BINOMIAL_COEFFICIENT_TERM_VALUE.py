import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    C = [ [ 0 for x in range ( n + 1 ) ] for y in range ( n + 1 ) ] ;
    for i in range ( n + 1 ) :
        for j in range ( min ( i , n ) + 1 ) :
            if ( j == 0 or j == i ) :
                C [ i ] [ j ] = 1 ;
            else :
                C [ i ] [ j ] = ( C [ i - 1 ] [ j - 1 ] + C [ i - 1 ] [ j ] ) ;
    maxvalue = 0 ;
    for i in range ( n + 1 ) :
        maxvalue = max ( maxvalue , C [ n ] [ i ] ) ;
    return maxvalue ;


#TOFILL
if __name__ == '__main__':
    param = [
    (23,),
    (41,),
    (69,),
    (56,),
    (71,),
    (38,),
    (26,),
    (52,),
    (93,),
    (44,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_BINOMIAL_COEFFICIENT_TERM_VALUE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_BINOMIAL_COEFFICIENT_TERM_VALUE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
