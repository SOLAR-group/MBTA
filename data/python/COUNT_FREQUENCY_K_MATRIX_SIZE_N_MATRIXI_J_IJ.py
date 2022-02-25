import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(n, k):
    if (n + 1 >= k):
        return (k - 1)
    else:
        return (2 * n + 1 - k)


#TOFILL
if __name__ == '__main__':
    param = [
        (90, 74,),
        (86, 36,),
        (92, 38,),
        (72, 71,),
        (25, 57,),
        (11, 53,),
        (94, 80,),
        (91, 75,),
        (66, 58,),
        (34, 88,)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_FREQUENCY_K_MATRIX_SIZE_N_MATRIXI_J_IJ," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_FREQUENCY_K_MATRIX_SIZE_N_MATRIXI_J_IJ," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
