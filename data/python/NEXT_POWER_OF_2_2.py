import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    n -= 1
    n |= n >> 1
    n |= n >> 2
    n |= n >> 4
    n |= n >> 8
    n |= n >> 16
    n += 1
    return n


#TOFILL
if __name__ == '__main__':
    param = [
    (63,),
    (78,),
    (13,),
    (5,),
    (34,),
    (69,),
    (63,),
    (78,),
    (80,),
    (19,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("NEXT_POWER_OF_2_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NEXT_POWER_OF_2_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
