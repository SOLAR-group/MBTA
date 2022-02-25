import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a ) :
    return ( 4 * a )


#TOFILL
if __name__ == '__main__':
    param = [
    (98,),
    (9,),
    (18,),
    (38,),
    (84,),
    (8,),
    (39,),
    (6,),
    (60,),
    (47,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PYTHON_PROGRAM_FIND_PERIMETER_CIRCUMFERENCE_SQUARE_RECTANGLE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PYTHON_PROGRAM_FIND_PERIMETER_CIRCUMFERENCE_SQUARE_RECTANGLE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
