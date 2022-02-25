import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    sm = 0
    for i in range ( 1 , n + 1 ) :
        for j in range ( i , n + 1 ) :
            sm = sm + i * j
    return sm


#TOFILL
if __name__ == '__main__':
    param = [
    (21,),
    (32,),
    (16,),
    (38,),
    (9,),
    (3,),
    (5,),
    (46,),
    (45,),
    (87,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_PAIRWISE_PRODUCTS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_PAIRWISE_PRODUCTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
