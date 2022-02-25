import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    position = 1
    m = 1
    while ( not ( n & m ) ) :
        m = m << 1
        position += 1
    return position


#TOFILL
if __name__ == '__main__':
    param = [
    (17,),
    (97,),
    (73,),
    (68,),
    (6,),
    (84,),
    (72,),
    (66,),
    (57,),
    (11,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("POSITION_OF_RIGHTMOST_SET_BIT_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("POSITION_OF_RIGHTMOST_SET_BIT_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
