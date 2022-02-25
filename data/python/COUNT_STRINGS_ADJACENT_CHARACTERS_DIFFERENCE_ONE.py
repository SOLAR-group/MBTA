import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    dp = [ [ 0 for j in range ( 27 ) ] for i in range ( n + 1 ) ]
    for i in range ( 0 , 26 ) :
        dp [ 1 ] [ i ] = 1
    for i in range ( 2 , n + 1 ) :
        for j in range ( 0 , 26 ) :
            if ( j == 0 ) :
                dp [ i ] [ j ] = dp [ i - 1 ] [ j + 1 ] ;
            else :
                dp [ i ] [ j ] = ( dp [ i - 1 ] [ j - 1 ] + dp [ i - 1 ] [ j + 1 ] )
    sum = 0
    for i in range ( 0 , 26 ) :
        sum = sum + dp [ n ] [ i ]
    return sum


#TOFILL
if __name__ == '__main__':
    param = [
    (7,),
    (47,),
    (72,),
    (66,),
    (71,),
    (56,),
    (61,),
    (68,),
    (78,),
    (22,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_STRINGS_ADJACENT_CHARACTERS_DIFFERENCE_ONE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_STRINGS_ADJACENT_CHARACTERS_DIFFERENCE_ONE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
