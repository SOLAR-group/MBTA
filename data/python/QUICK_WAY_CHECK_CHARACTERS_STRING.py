import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    n = len ( s )
    for i in range ( 1 , n ) :
        if s [ i ] != s [ 0 ] :
            return False
    return True


#TOFILL
if __name__ == '__main__':
    param = [
    ('',),
    ('ggg',),
    ('11',),
    ('KoYIHns',),
    ('232',),
    ('10111000011101',),
    ('DDDD',),
    ('11',),
    ('11111',),
    ('ewJvixQzu',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("QUICK_WAY_CHECK_CHARACTERS_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("QUICK_WAY_CHECK_CHARACTERS_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
