import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    p = 1
    if ( n and not ( n & ( n - 1 ) ) ) :
        return n
    while ( p < n ) :
        p <<= 1
    return p ;


#TOFILL
if __name__ == '__main__':
    param = [
    (8,),
    (79,),
    (31,),
    (63,),
    (18,),
    (2,),
    (6,),
    (85,),
    (29,),
    (8,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NEXT_POWER_OF_2_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NEXT_POWER_OF_2_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
