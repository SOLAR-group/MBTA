import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if ( n <= 1 ) :
        return False
    for i in range ( 2 , n ) :
        if ( n % i == 0 ) :
            return False
    return True


#TOFILL
if __name__ == '__main__':
    param = [
    (2,),
    (74,),
    (46,),
    (38,),
    (51,),
    (48,),
    (6,),
    (14,),
    (31,),
    (10,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PRIME_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PRIME_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
