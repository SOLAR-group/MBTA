import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if ( n <= 1 ) :
        return n
    a = 0
    b = 1
    c = 1
    res = 1
    while ( c < n ) :
        c = a + b
        res = res + 1
        a = b
        b = c
    return res


#TOFILL
if __name__ == '__main__':
    param = [
    (5,),
    (19,),
    (7,),
    (94,),
    (58,),
    (65,),
    (69,),
    (96,),
    (80,),
    (14,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
