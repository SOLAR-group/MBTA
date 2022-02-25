import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    length = int ( s / 3 )
    s -= length
    breadth = s / 2
    height = s - breadth
    return int ( length * breadth * height )


#TOFILL
if __name__ == '__main__':
    param = [
    (8,),
    (96,),
    (96,),
    (96,),
    (12,),
    (95,),
    (72,),
    (81,),
    (42,),
    (13,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
