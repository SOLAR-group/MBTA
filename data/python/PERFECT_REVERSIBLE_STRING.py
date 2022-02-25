import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    i = 0 ; j = len ( str ) - 1 ;
    while ( i < j ) :
        if ( str [ i ] != str [ j ] ) :
            return False ;
        i += 1 ;
        j -= 1 ;
    return True ;


#TOFILL
if __name__ == '__main__':
    param = [
    ('ab',),
    ('303',),
    ('11110000',),
    ('aba',),
    ('404',),
    ('10101',),
    ('abab',),
    ('6366',),
    ('001',),
    ('',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PERFECT_REVERSIBLE_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PERFECT_REVERSIBLE_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
