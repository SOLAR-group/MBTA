import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    x = 0
    res = 0
    yCount = 0
    while ( yCount * yCount < n ) :
        yCount = yCount + 1
    while ( yCount != 0 ) :
        res = res + yCount
        x = x + 1
        while ( yCount != 0 and ( x * x + ( yCount - 1 ) * ( yCount - 1 ) >= n ) ) :
            yCount = yCount - 1
    return res


#TOFILL
if __name__ == '__main__':
    param = [
    (72,),
    (75,),
    (92,),
    (30,),
    (45,),
    (40,),
    (81,),
    (17,),
    (81,),
    (99,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_DISTINCT_NON_NEGATIVE_PAIRS_X_Y_SATISFY_INEQUALITY_XX_YY_N_2_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_DISTINCT_NON_NEGATIVE_PAIRS_X_Y_SATISFY_INEQUALITY_XX_YY_N_2_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
