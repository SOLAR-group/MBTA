import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    p = - 1
    for i in range ( len ( s ) ) :
        for j in range ( i + 1 , len ( s ) ) :
            if ( s [ i ] == s [ j ] ) :
                p = i
                break
        if ( p != - 1 ) :
            break
    return p


#TOFILL
if __name__ == '__main__':
    param = [
    ('ORXMflacQFBv',),
    ('39977638567848',),
    ('011110011011',),
    ('fYjfNy',),
    ('222280492',),
    ('11',),
    ('UjntBg',),
    ('6866190138212',),
    ('0000',),
    ('FWz PWEQgVlRZ',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_REPEATED_CHARACTER_PRESENT_FIRST_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_REPEATED_CHARACTER_PRESENT_FIRST_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
