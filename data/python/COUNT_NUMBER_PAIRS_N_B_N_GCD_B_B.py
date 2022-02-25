import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(n):
    k = n
    imin = 1
    ans = 0
    while (imin <= n):
        imax = n / k
        ans += k * (imax - imin + 1)
        imin = imax + 1
        k = n / imin
    return ans


#TOFILL
if __name__ == '__main__':
    param = [
        (17,),
        (72,),
        (43,),
        (55,),
        (62,),
        (22,),
        (17,),
        (68,),
        (20,),
        (29,)
    ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_NUMBER_PAIRS_N_B_N_GCD_B_B," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_NUMBER_PAIRS_N_B_N_GCD_B_B," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
