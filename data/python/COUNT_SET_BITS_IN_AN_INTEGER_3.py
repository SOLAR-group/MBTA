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
        return 1 + f_gold ( n & ( n - 1 ) )


#TOFILL
if __name__ == '__main__':
    param = [
    (6,),
    (58,),
    (90,),
    (69,),
    (15,),
    (54,),
    (60,),
    (51,),
    (46,),
    (91,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_SET_BITS_IN_AN_INTEGER_3," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_SET_BITS_IN_AN_INTEGER_3," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
