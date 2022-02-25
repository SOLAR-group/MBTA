import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    for i in range ( len ( s ) ) :
        if s [ i ].isdigit ( ) != True :
            return False
    return True


#TOFILL
if __name__ == '__main__':
    param = [
    ('MgTOyHo NT',),
    ('033675175',),
    ('011001',),
    ('XLlccG',),
    ('8223900094410',),
    ('000',),
    ('aupp',),
    ('90202721499',),
    ('110000100011',),
    ('MhYHsMQeLhG',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_CHECK_INPUT_INTEGER_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_CHECK_INPUT_INTEGER_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
