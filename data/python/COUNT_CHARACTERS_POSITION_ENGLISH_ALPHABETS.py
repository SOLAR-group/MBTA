import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    result = 0
    for i in range ( len ( str ) ) :
        if ( ( i == ord ( str [ i ] ) - ord ( 'a' ) ) or ( i == ord ( str [ i ] ) - ord ( 'A' ) ) ) :
            result += 1
    return result


#TOFILL
if __name__ == '__main__':
    param = [
    ('lLkhFeZGcb',),
    ('ABcED',),
    ('geeksforgeeks',),
    ('Alphabetical',),
    ('abababab',),
    ('bcdefgxyz',),
    ('cBzaqx L',),
    (' bcd',),
    ('11',),
    ('MqqKY',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_CHARACTERS_POSITION_ENGLISH_ALPHABETS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_CHARACTERS_POSITION_ENGLISH_ALPHABETS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
