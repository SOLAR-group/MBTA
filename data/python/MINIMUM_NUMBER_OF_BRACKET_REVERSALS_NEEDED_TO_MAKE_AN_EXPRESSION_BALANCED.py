import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( expr ) :
    lenn = len ( expr )
    if ( lenn % 2 ) :
        return - 1
    s = [ ]
    for i in range ( lenn ) :
        if ( expr [ i ] == '' and len ( s ) ) :
            if ( s [ 0 ] == '' ) :
                s.pop ( 0 )
            else :
                s.insert ( 0 , expr [ i ] )
        else :
            s.insert ( 0 , expr [ i ] )
    red_len = len ( s )
    n = 0
    while ( len ( s ) and s [ 0 ] == '' ) :
        s.pop ( 0 )
        n += 1
    return ( red_len // 2 + n % 2 )


#TOFILL
if __name__ == '__main__':
    param = [
    ('}{',),
    ('{{{',),
    ('{{{{',),
    ('{{{{}}',),
    ('}{{}}{{{',),
    ('{}',),
    ('',),
    ('8',),
    ('01111000',),
    ('XPkERzHcpId',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MINIMUM_NUMBER_OF_BRACKET_REVERSALS_NEEDED_TO_MAKE_AN_EXPRESSION_BALANCED," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MINIMUM_NUMBER_OF_BRACKET_REVERSALS_NEEDED_TO_MAKE_AN_EXPRESSION_BALANCED," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
