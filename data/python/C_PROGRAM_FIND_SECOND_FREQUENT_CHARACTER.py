import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    NO_OF_CHARS = 256
    count = [ 0 ] * NO_OF_CHARS
    for i in range ( len ( str ) ) :
        count [ ord ( str [ i ] ) ] += 1
    first , second = 0 , 0
    for i in range ( NO_OF_CHARS ) :
        if count [ i ] > count [ first ] :
            second = first
            first = i
        elif ( count [ i ] > count [ second ] and count [ i ] != count [ first ] ) :
            second = i
    return chr ( second )


#TOFILL
if __name__ == '__main__':
    param = [
    ('SgUmIrEAB',),
    ('304',),
    ('0010',),
    ('VGC BeErLvQ',),
    ('0872',),
    ('00110001',),
    ('Lsqwm',),
    ('308998',),
    ('1000011',),
    ('XCEOs',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("C_PROGRAM_FIND_SECOND_FREQUENT_CHARACTER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("C_PROGRAM_FIND_SECOND_FREQUENT_CHARACTER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
