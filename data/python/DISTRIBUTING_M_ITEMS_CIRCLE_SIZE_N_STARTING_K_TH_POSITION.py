import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , m , k ) :
    if ( m <= n - k + 1 ) :
        return m + k - 1
    m = m - ( n - k + 1 )
    if ( m % n == 0 ) :
        return n
    else :
        return m % n


#TOFILL
if __name__ == '__main__':
    param = [
    (19,14,34,),
    (23,51,5,),
    (92,10,24,),
    (9,50,34,),
    (20,67,20,),
    (68,25,40,),
    (66,30,24,),
    (77,22,32,),
    (90,1,71,),
    (26,34,54,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
