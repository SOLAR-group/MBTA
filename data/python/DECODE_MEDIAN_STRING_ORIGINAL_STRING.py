import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    l = len ( s )
    s1 = ""
    if ( l % 2 == 0 ) :
        isEven = True
    else :
        isEven = False
    for i in range ( 0 , l , 2 ) :
        if ( isEven ) :
            s1 = s [ i ] + s1
            s1 += s [ i + 1 ]
        else :
            if ( l - i > 1 ) :
                s1 += s [ i ]
                s1 = s [ i + 1 ] + s1
            else :
                s1 += s [ i ]
    return s1


#TOFILL
if __name__ == '__main__':
    param = [
    (' EgvQCeqYpZtv',),
    ('488540',),
    ('0000101010111',),
    ('syw',),
    ('402355',),
    ('0',),
    ('wmHMlAtq',),
    ('7962',),
    ('111111',),
    ('UbgRGDquop',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("DECODE_MEDIAN_STRING_ORIGINAL_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DECODE_MEDIAN_STRING_ORIGINAL_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
