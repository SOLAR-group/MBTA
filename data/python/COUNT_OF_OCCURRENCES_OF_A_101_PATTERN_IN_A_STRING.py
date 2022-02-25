import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    length = len ( s )
    oneSeen = False
    count = 0
    for i in range ( length ) :
        if ( s [ i ] == '1' and oneSeen ) :
            if ( s [ i - 1 ] == '0' ) :
                count += 1
        if ( s [ i ] == '1' and oneSeen == 0 ) :
            oneSeen = True
        if ( s [ i ] != '0' and s [ i ] != '1' ) :
            oneSeen = False
    return count


#TOFILL
if __name__ == '__main__':
    param = [
    ('1001ab010abc01001',),
    ('1001010001',),
    ('010100010100',),
    ('DLCu',),
    ('7072430592',),
    ('011',),
    ('pnJpypYOza',),
    ('1037',),
    ('111',),
    ('HxK',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_OF_OCCURRENCES_OF_A_101_PATTERN_IN_A_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_OF_OCCURRENCES_OF_A_101_PATTERN_IN_A_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
