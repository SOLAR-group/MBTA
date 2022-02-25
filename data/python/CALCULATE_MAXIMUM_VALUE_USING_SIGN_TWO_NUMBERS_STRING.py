import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    res = ord ( str [ 0 ] ) - 48
    for i in range ( 1 , len ( str ) ) :
        if ( str [ i ] == '0' or str [ i ] == '1' or res < 2 ) :
            res += ord ( str [ i ] ) - 48
        else :
            res *= ord ( str [ i ] ) - 48
    return res


#TOFILL
if __name__ == '__main__':
    param = [
    ('pR',),
    ('9518',),
    ('1',),
    ('nNMCIXUCpRMmvO',),
    ('3170487',),
    ('0100101010',),
    ('Z rONcUqWb',),
    ('00419297',),
    ('00',),
    ('r',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CALCULATE_MAXIMUM_VALUE_USING_SIGN_TWO_NUMBERS_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CALCULATE_MAXIMUM_VALUE_USING_SIGN_TWO_NUMBERS_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
