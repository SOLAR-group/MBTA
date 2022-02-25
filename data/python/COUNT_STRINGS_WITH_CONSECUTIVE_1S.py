import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    a = [ 0 ] * n
    b = [ 0 ] * n
    a [ 0 ] = b [ 0 ] = 1
    for i in range ( 1 , n ) :
        a [ i ] = a [ i - 1 ] + b [ i - 1 ]
        b [ i ] = a [ i - 1 ]
    return ( 1 << n ) - a [ n - 1 ] - b [ n - 1 ]


#TOFILL
if __name__ == '__main__':
    param = [
    (27,),
    (72,),
    (13,),
    (83,),
    (75,),
    (33,),
    (57,),
    (51,),
    (10,),
    (1,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_STRINGS_WITH_CONSECUTIVE_1S," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_STRINGS_WITH_CONSECUTIVE_1S," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
