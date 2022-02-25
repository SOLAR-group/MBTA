import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    der = [ 0 for i in range ( n + 1 ) ]
    der [ 0 ] = 1
    der [ 1 ] = 0
    der [ 2 ] = 1
    for i in range ( 3 , n + 1 ) :
        der [ i ] = ( i - 1 ) * ( der [ i - 1 ] + der [ i - 2 ] )
    return der [ n ]


#TOFILL
if __name__ == '__main__':
    param = [
    (22,),
    (91,),
    (33,),
    (93,),
    (90,),
    (59,),
    (88,),
    (41,),
    (70,),
    (63,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_DERANGEMENTS_PERMUTATION_SUCH_THAT_NO_ELEMENT_APPEARS_IN_ITS_ORIGINAL_POSITION_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_DERANGEMENTS_PERMUTATION_SUCH_THAT_NO_ELEMENT_APPEARS_IN_ITS_ORIGINAL_POSITION_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
