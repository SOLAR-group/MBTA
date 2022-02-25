import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if ( n == 0 or n == 1 ) :
        return 1 ;
    return n * f_gold ( n - 2 ) ;


#TOFILL
if __name__ == '__main__':
    param = [
    (52,),
    (93,),
    (15,),
    (72,),
    (61,),
    (21,),
    (83,),
    (87,),
    (75,),
    (75,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("DOUBLE_FACTORIAL," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DOUBLE_FACTORIAL," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
