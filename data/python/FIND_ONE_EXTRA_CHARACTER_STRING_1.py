import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( strA , strB ) :
    res = 0
    for i in range ( 0 , len ( strA ) ) :
        res = res ^ ( ord ) ( strA [ i ] )
    for i in range ( 0 , len ( strB ) ) :
        res = res ^ ( ord ) ( strB [ i ] )
    return ( ( chr ) ( res ) ) ;


#TOFILL
if __name__ == '__main__':
    param = [
    ('obfLA mmMYvghH','obfLA  mmMYvghH',),
    ('2941','2941',),
    ('0111111','0111111',),
    ('oWvbFstI','oWvbFstI',),
    ('4937516500','4937516500',),
    ('101110100','101110100',),
    ('hYZscJQFBE','hYZscJQFBE',),
    ('58443','58443',),
    ('1100','1100',),
    ('ZUdYuIBVNaeeb','ZUdYuIBVNaeeb',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_ONE_EXTRA_CHARACTER_STRING_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_ONE_EXTRA_CHARACTER_STRING_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
