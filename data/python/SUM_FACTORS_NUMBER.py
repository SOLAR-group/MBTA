import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    result = 0
    for i in range ( 2 , ( int ) ( math.sqrt ( n ) ) + 1 ) :
        if ( n % i == 0 ) :
            if ( i == ( n / i ) ) :
                result = result + i
            else :
                result = result + ( i + n // i )
    return ( result + n + 1 )


#TOFILL
if __name__ == '__main__':
    param = [
    (76,),
    (21,),
    (4,),
    (49,),
    (35,),
    (55,),
    (43,),
    (39,),
    (36,),
    (5,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
