import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    n = len ( str )
    dp = [ [ 0 ] * ( n + 1 ) ] * ( n + 1 )
    for i in range ( 1 , n + 1 ) :
        for j in range ( 1 , n + 1 ) :
            if ( str [ i - 1 ] == str [ j - 1 ] and i != j ) :
                dp [ i ] [ j ] = 1 + dp [ i - 1 ] [ j - 1 ]
            else :
                dp [ i ] [ j ] = max ( dp [ i ] [ j - 1 ] , dp [ i - 1 ] [ j ] )
    return dp [ n ] [ n ]


#TOFILL
if __name__ == '__main__':
    param = [
    ('JxZFz',),
    ('7648992235770',),
    ('11100000',),
    ('cRN  SgYjPsctJ',),
    ('434',),
    ('1',),
    ('JRfZIAsbrPBZ',),
    ('03779368305592',),
    ('1111000',),
    ('BkULuIi',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("LONGEST_REPEATING_SUBSEQUENCE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LONGEST_REPEATING_SUBSEQUENCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
