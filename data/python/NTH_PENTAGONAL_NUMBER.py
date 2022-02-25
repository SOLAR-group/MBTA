import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return ( 3 * n * n - n ) / 2


#TOFILL
if __name__ == '__main__':
    param = [
    (96,),
    (93,),
    (15,),
    (8,),
    (21,),
    (14,),
    (11,),
    (79,),
    (24,),
    (94,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NTH_PENTAGONAL_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NTH_PENTAGONAL_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
