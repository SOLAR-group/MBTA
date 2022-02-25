import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    res = 0
    x = 0
    while ( x * x < n ) :
        y = 0
        while ( x * x + y * y < n ) :
            res = res + 1
            y = y + 1
        x = x + 1
    return res


#TOFILL
if __name__ == '__main__':
    param = [
    (61,),
    (45,),
    (53,),
    (4,),
    (82,),
    (86,),
    (37,),
    (48,),
    (81,),
    (50,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_DISTINCT_NON_NEGATIVE_PAIRS_X_Y_SATISFY_INEQUALITY_XX_YY_N_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_DISTINCT_NON_NEGATIVE_PAIRS_X_Y_SATISFY_INEQUALITY_XX_YY_N_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
