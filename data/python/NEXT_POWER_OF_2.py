import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    count = 0 ;
    if ( n and not ( n & ( n - 1 ) ) ) :
        return n
    while ( n != 0 ) :
        n >>= 1
        count += 1
    return 1 << count ;


#TOFILL
if __name__ == '__main__':
    param = [
    (74,),
    (70,),
    (85,),
    (78,),
    (71,),
    (32,),
    (97,),
    (90,),
    (64,),
    (48,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("NEXT_POWER_OF_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NEXT_POWER_OF_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
