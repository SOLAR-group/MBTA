import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x ) :
    return ( x << 1 ) + x + ( x >> 1 )


#TOFILL
if __name__ == '__main__':
    param = [
    (58,),
    (16,),
    (82,),
    (33,),
    (88,),
    (51,),
    (81,),
    (38,),
    (79,),
    (89,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("MULTIPLY_AN_INTEGER_WITH_3_5," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MULTIPLY_AN_INTEGER_WITH_3_5," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
