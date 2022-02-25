import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    tmp = str + str
    n = len ( str )
    for i in range ( 1 , n + 1 ) :
        substring = tmp [ i : n ]
        if ( str == substring ) :
            return i
    return n


#TOFILL
if __name__ == '__main__':
    param = [
    ('vdevdNdQSopPtj',),
    ('5',),
    ('100010101011',),
    ('tlDOvJHAyMllu',),
    ('06',),
    ('101',),
    ('DYgtU',),
    ('4',),
    ('00',),
    ('Dt',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MINIMUM_ROTATIONS_REQUIRED_GET_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MINIMUM_ROTATIONS_REQUIRED_GET_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
