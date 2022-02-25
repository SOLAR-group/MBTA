import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    res = list ( )
    res.append ( 0 )
    res.append ( 1 )
    i = 2
    while i < n + 1 :
        res.append ( max ( i , ( res [ int ( i / 2 ) ] + res [ int ( i / 3 ) ] + res [ int ( i / 4 ) ] + res [ int ( i / 5 ) ] ) ) )
        i = i + 1
    return res [ n ]


#TOFILL
if __name__ == '__main__':
    param = [
    (3,),
    (19,),
    (39,),
    (89,),
    (96,),
    (68,),
    (48,),
    (5,),
    (3,),
    (4,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_VALUE_CHOICE_EITHER_DIVIDING_CONSIDERING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_VALUE_CHOICE_EITHER_DIVIDING_CONSIDERING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
