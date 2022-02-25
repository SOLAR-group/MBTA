import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num ) :
    if num < 0 :
        return f_gold ( - num )
    if ( num == 0 or num == 7 ) :
        return True
    if ( num < 10 ) :
        return False
    return f_gold ( num / 10 - 2 * ( num - num / 10 * 10 ) )


#TOFILL
if __name__ == '__main__':
    param = [
    (0,),
    (-21,),
    (7,),
    (63,),
    (84,),
    (73,),
    (81,),
    (-10,),
    (47,),
    (23,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DIVISIBILITY_BY_7," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DIVISIBILITY_BY_7," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
