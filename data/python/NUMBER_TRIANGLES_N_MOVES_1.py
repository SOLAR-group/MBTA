import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    ans = 2 * ( pow ( 3 , n ) ) - 1 ;
    return ans ;


#TOFILL
if __name__ == '__main__':
    param = [
    (78,),
    (89,),
    (46,),
    (56,),
    (79,),
    (71,),
    (80,),
    (77,),
    (48,),
    (16,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_TRIANGLES_N_MOVES_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_TRIANGLES_N_MOVES_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
