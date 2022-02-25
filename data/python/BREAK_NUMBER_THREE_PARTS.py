import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    count = 0
    for i in range ( 0 , n + 1 ) :
        for j in range ( 0 , n + 1 ) :
            for k in range ( 0 , n + 1 ) :
                if ( i + j + k == n ) :
                    count = count + 1
    return count


#TOFILL
if __name__ == '__main__':
    param = [
    (52,),
    (47,),
    (75,),
    (36,),
    (68,),
    (16,),
    (99,),
    (38,),
    (84,),
    (45,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("BREAK_NUMBER_THREE_PARTS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("BREAK_NUMBER_THREE_PARTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
