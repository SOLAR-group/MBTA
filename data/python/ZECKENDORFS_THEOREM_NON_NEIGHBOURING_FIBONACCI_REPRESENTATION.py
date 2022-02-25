import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if ( n == 0 or n == 1 ) :
        return n
    f1 , f2 , f3 = 0 , 1 , 1
    while ( f3 <= n ) :
        f1 = f2 ;
        f2 = f3 ;
        f3 = f1 + f2 ;
    return f2 ;


#TOFILL
if __name__ == '__main__':
    param = [
    (54,),
    (71,),
    (64,),
    (71,),
    (96,),
    (43,),
    (70,),
    (94,),
    (95,),
    (69,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
