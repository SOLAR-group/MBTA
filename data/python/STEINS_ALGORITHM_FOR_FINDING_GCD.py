import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    if ( a == 0 ) :
        return b
    if ( b == 0 ) :
        return a
    k = 0
    while ( ( ( a | b ) & 1 ) == 0 ) :
        a = a >> 1
        b = b >> 1
        k = k + 1
    while ( ( a & 1 ) == 0 ) :
        a = a >> 1
    while ( b != 0 ) :
        while ( ( b & 1 ) == 0 ) :
            b = b >> 1
        if ( a > b ) :
            temp = a
            a = b
            b = temp
        b = ( b - a )
    return ( a << k )


#TOFILL
if __name__ == '__main__':
    param = [
    (37,93,),
    (58,13,),
    (89,27,),
    (75,14,),
    (59,47,),
    (84,39,),
    (47,76,),
    (37,75,),
    (83,62,),
    (28,58,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("STEINS_ALGORITHM_FOR_FINDING_GCD," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("STEINS_ALGORITHM_FOR_FINDING_GCD," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
