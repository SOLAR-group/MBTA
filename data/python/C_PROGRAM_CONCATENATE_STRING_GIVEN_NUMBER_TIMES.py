import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s , n ) :
    s1 = s
    for i in range ( 1 , n ) :
        s += s1
    return s


#TOFILL
if __name__ == '__main__':
    param = [
    ('LPWsaI',41,),
    ('9037515104',72,),
    ('00100010010111',95,),
    ('SbwipuE',27,),
    ('574314109',5,),
    ('1101',70,),
    ('f',91,),
    ('068',50,),
    ('000011001',38,),
    ('BWbUtIkC',79,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("C_PROGRAM_CONCATENATE_STRING_GIVEN_NUMBER_TIMES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("C_PROGRAM_CONCATENATE_STRING_GIVEN_NUMBER_TIMES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
