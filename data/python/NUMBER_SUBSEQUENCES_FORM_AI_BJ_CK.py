import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    aCount = 0
    bCount = 0
    cCount = 0
    for i in range ( len ( s ) ) :
        if ( s [ i ] == 'a' ) :
            aCount = ( 1 + 2 * aCount )
        elif ( s [ i ] == 'b' ) :
            bCount = ( aCount + 2 * bCount )
        elif ( s [ i ] == 'c' ) :
            cCount = ( bCount + 2 * cCount )
    return cCount


#TOFILL
if __name__ == '__main__':
    param = [
    ('',),
    ('abbc',),
    ('abcabc',),
    ('agsdbkfdc ',),
    ('ababab',),
    ('aaaaaaa',),
    ('aabaaabcc',),
    ('19',),
    ('1001100',),
    ('DtAnuQbU',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
