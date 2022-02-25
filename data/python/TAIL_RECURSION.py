import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if ( n == 0 ) :
        return 1
    return n * f_gold ( n - 1 )


#TOFILL
if __name__ == '__main__':
    param = [
    (77,),
    (62,),
    (42,),
    (16,),
    (82,),
    (37,),
    (29,),
    (32,),
    (82,),
    (91,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("TAIL_RECURSION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TAIL_RECURSION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
