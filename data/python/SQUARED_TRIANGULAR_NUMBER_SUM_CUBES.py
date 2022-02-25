import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    _sum = 0
    n = 1
    while ( _sum < s ) :
        _sum += n * n * n
        n += 1
    n -= 1
    if _sum == s :
        return n
    return - 1


#TOFILL
if __name__ == '__main__':
    param = [
    (15,),
    (36,),
    (39,),
    (43,),
    (75,),
    (49,),
    (56,),
    (14,),
    (62,),
    (97,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SQUARED_TRIANGULAR_NUMBER_SUM_CUBES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SQUARED_TRIANGULAR_NUMBER_SUM_CUBES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
