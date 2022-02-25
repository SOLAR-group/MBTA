import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return - 1 if ( n & 1 ) else 1


#TOFILL
if __name__ == '__main__':
    param = [
    (67,),
    (2,),
    (58,),
    (6,),
    (42,),
    (17,),
    (37,),
    (44,),
    (23,),
    (40,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("CASSINIS_IDENTITY," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CASSINIS_IDENTITY," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
