import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( A , B , C , M ) :
    res = pow ( B , C , M - 1 )
    ans = pow ( A , res , M )
    return ans


#TOFILL
if __name__ == '__main__':
    param = [
    (49,7,63,7,),
    (31,75,82,61,),
    (29,10,82,15,),
    (26,59,12,13,),
    (10,76,14,53,),
    (18,40,71,78,),
    (48,21,41,91,),
    (17,35,78,80,),
    (49,73,69,86,),
    (22,85,6,8,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_POWER_POWER_MOD_PRIME," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_POWER_POWER_MOD_PRIME," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
