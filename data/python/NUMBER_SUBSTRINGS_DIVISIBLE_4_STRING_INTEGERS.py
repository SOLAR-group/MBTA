import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    n = len ( s )
    count = 0 ;
    for i in range ( 0 , n , 1 ) :
        if ( s [ i ] == '4' or s [ i ] == '8' or s [ i ] == '0' ) :
            count += 1
    for i in range ( 0 , n - 1 , 1 ) :
        h = ( ord ( s [ i ] ) - ord ( '0' ) ) * 10 + ( ord ( s [ i + 1 ] ) - ord ( '0' ) )
        if ( h % 4 == 0 ) :
            count = count + i + 1
    return count


#TOFILL
if __name__ == '__main__':
    param = [
    ('Qaq',),
    ('9400761825850',),
    ('0011001111',),
    ('lasWqrLRq',),
    ('5662',),
    ('110',),
    (' tOYKf',),
    ('6536991235305',),
    ('11111',),
    ('uZftT iDHcYiCt',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_SUBSTRINGS_DIVISIBLE_4_STRING_INTEGERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_SUBSTRINGS_DIVISIBLE_4_STRING_INTEGERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
