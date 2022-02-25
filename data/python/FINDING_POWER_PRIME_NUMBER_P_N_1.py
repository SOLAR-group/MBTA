import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , p ) :
    ans = 0
    temp = p
    while ( temp <= n ) :
        ans += n / temp
        temp = temp * p
    return int ( ans )


#TOFILL
if __name__ == '__main__':
    param = [
    (76,43,),
    (77,91,),
    (9,42,),
    (59,67,),
    (8,52,),
    (97,8,),
    (78,24,),
    (41,88,),
    (72,61,),
    (71,28,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FINDING_POWER_PRIME_NUMBER_P_N_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FINDING_POWER_PRIME_NUMBER_P_N_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
