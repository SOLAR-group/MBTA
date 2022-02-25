import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return ( ( n << 3 ) - n )


#TOFILL
if __name__ == '__main__':
    param = [
    (41,),
    (42,),
    (62,),
    (4,),
    (31,),
    (75,),
    (5,),
    (75,),
    (85,),
    (19,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("EFFICIENT_WAY_TO_MULTIPLY_WITH_7," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("EFFICIENT_WAY_TO_MULTIPLY_WITH_7," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
