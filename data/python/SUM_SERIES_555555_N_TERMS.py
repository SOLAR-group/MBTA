import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return ( int ) ( 0.6172 * ( pow ( 10 , n ) - 1 ) - 0.55 * n )


#TOFILL
if __name__ == '__main__':
    param = [
    (18,),
    (81,),
    (77,),
    (84,),
    (87,),
    (14,),
    (15,),
    (3,),
    (21,),
    (60,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_SERIES_555555_N_TERMS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_SERIES_555555_N_TERMS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
