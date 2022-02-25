import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( side ) :
    area = side * side
    return area


#TOFILL
if __name__ == '__main__':
    param = [
    (50,),
    (64,),
    (92,),
    (23,),
    (38,),
    (55,),
    (67,),
    (56,),
    (60,),
    (90,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_AREA_SQUARE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_AREA_SQUARE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
