import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    arr = [ [ 0 for x in range ( n ) ] for y in range ( n ) ]
    for i in range ( n ) :
        for j in range ( n ) :
            arr [ i ] [ j ] = abs ( i - j )
    sum = 0
    for i in range ( n ) :
        for j in range ( n ) :
            sum += arr [ i ] [ j ]
    return sum


#TOFILL
if __name__ == '__main__':
    param = [
    (60,),
    (44,),
    (72,),
    (90,),
    (99,),
    (45,),
    (27,),
    (11,),
    (65,),
    (52,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
