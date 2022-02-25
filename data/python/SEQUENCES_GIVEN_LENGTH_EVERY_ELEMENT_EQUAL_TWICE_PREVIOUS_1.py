import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( m , n ) :
    T = [ [ 0 for i in range ( n + 1 ) ] for i in range ( m + 1 ) ]
    for i in range ( m + 1 ) :
        for j in range ( n + 1 ) :
            if i == 0 or j == 0 :
                T [ i ] [ j ] = 0
            elif i < j :
                T [ i ] [ j ] = 0
            elif j == 1 :
                T [ i ] [ j ] = i
            else :
                T [ i ] [ j ] = T [ i - 1 ] [ j ] + T [ i // 2 ] [ j - 1 ]
    return T [ m ] [ n ]


#TOFILL
if __name__ == '__main__':
    param = [
    (10,4,),
    (5,2,),
    (2,8,),
    (83,7,),
    (91,0,),
    (18,53,),
    (83,41,),
    (98,53,),
    (43,37,),
    (31,20,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
