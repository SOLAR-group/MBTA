import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    while ( int ( n / 100 ) ) :
        last_digit = int ( n % 10 )
        n = int ( n / 10 )
        n += last_digit * 3
    return ( n % 29 == 0 )


#TOFILL
if __name__ == '__main__':
    param = [
    (29,),
(0,),
(65,),
(1419,),
(54,),
(7,),
(44,),
(34,),
(1160,),
(292929002929,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_IS_DIVISIBLE_BY_29_OR_NOT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_IS_DIVISIBLE_BY_29_OR_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
