import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , k ) :
    oneSeen = False
    while ( n > 0 ) :
        digit = n % k
        if ( digit > 1 ) :
            return False
        if ( digit == 1 ) :
            if ( oneSeen ) :
                return False
            oneSeen = True
        n //= k
    return True


#TOFILL
if __name__ == '__main__':
    param = [
    (64,4,),
    (16,2,),
    (27,3,),
    (81,72,),
    (1,9,),
    (69,17,),
    (8,20,),
    (31,79,),
    (43,81,),
    (54,89,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_NUMBER_POWER_K_USING_BASE_CHANGING_METHOD," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_NUMBER_POWER_K_USING_BASE_CHANGING_METHOD," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
