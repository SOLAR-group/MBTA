import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , a = 0 , b = 1 ) :
    if n == 0 :
        return a
    if n == 1 :
        return b
    return f_gold ( n - 1 , b , a + b ) ;


#TOFILL
if __name__ == '__main__':
    param = [
    (4,43,24,),
    (60,48,98,),
    (92,21,69,),
    (73,79,38,),
    (58,38,30,),
    (82,26,12,),
    (53,10,17,),
    (57,37,26,),
    (47,91,99,),
    (83,3,64,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("TAIL_RECURSION_FIBONACCI," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TAIL_RECURSION_FIBONACCI," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
