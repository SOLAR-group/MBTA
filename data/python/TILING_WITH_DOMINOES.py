import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    A = [ 0 ] * ( n + 1 )
    B = [ 0 ] * ( n + 1 )
    A [ 0 ] = 1
    A [ 1 ] = 0
    B [ 0 ] = 0
    B [ 1 ] = 1
    for i in range ( 2 , n + 1 ) :
        A [ i ] = A [ i - 2 ] + 2 * B [ i - 1 ]
        B [ i ] = A [ i - 1 ] + B [ i - 2 ]
    return A [ n ]


#TOFILL
if __name__ == '__main__':
    param = [
    (29,),
    (13,),
    (25,),
    (65,),
    (27,),
    (42,),
    (19,),
    (50,),
    (59,),
    (13,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("TILING_WITH_DOMINOES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TILING_WITH_DOMINOES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
