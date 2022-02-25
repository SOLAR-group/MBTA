import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if ( n == 0 ) :
        return 0
    else :
        return ( n & 1 ) + f_gold ( n >> 1 )


#TOFILL
if __name__ == '__main__':
    param = [
    (43,),
    (94,),
    (72,),
    (86,),
    (42,),
    (33,),
    (8,),
    (74,),
    (29,),
    (34,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_SET_BITS_IN_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_SET_BITS_IN_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
