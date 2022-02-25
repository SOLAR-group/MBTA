import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    n = len ( s ) ;
    sub_count = ( n * ( n + 1 ) ) // 2 ;
    arr = [ 0 ] * sub_count ;
    index = 0 ;
    for i in range ( n ) :
        for j in range ( 1 , n - i + 1 ) :
            arr [ index ] = s [ i : i + j ] ;
            index += 1 ;
    arr.sort ( ) ;
    res = "" ;
    for i in range ( sub_count ) :
        res += arr [ i ] ;
    return res ;


#TOFILL
if __name__ == '__main__':
    param = [
    ('sqGOi',),
    ('848580',),
    ('01001110011001',),
    ('ZhWXUKmeiI',),
    ('0917296541285',),
    ('01101001111100',),
    ('tjP kR',),
    ('999907',),
    ('011100',),
    ('qJPHNSJOUj',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("LEXICOGRAPHICAL_CONCATENATION_SUBSTRINGS_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LEXICOGRAPHICAL_CONCATENATION_SUBSTRINGS_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
