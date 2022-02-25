import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , size ) :
    positive = 0
    negative = 1
    while ( True ) :
        while ( positive < size and a [ positive ] >= 0 ) :
            positive = positive + 2
        while ( negative < size and a [ negative ] <= 0 ) :
            negative = negative + 2
        if ( positive < size and negative < size ) :
            temp = a [ positive ]
            a [ positive ] = a [ negative ]
            a [ negative ] = temp
        else :
            break


#TOFILL
if __name__ == '__main__':
    param = [
    ([8, 11, 18, 23, 24, 28, 28, 34, 35, 42, 44, 53, 57, 65, 71, 72, 76, 78, 82, 82, 85, 86, 92, 93],15,),
    ([0, -95, -51, -2, -70, -28, 3, -37, 75, -74, 85, -63, -93, 27, 68, -8, 67, 90, 3, -47, 32, 8, 12, 53, -93, 56, 97],15,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],40,),
    ([28, 85, 78, 33, 10, 83, 30, 22, 3, 82, 75, 48, 2, 76, 54, 6, 40, 93, 94],10,),
    ([-98, -94, -7, -3, 1, 11, 11, 83, 88],7,),
    ([0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0],35,),
    ([8, 35, 37, 38, 39, 46, 49, 54],6,),
    ([-60, -66, -4, -21, 27, -83, 61, 75, 10, -48, 18, -91, -67, 88, 13, 49, 86, -15, 97, -90, -94, 15, 21, 41, -35, -80, -43, -54],21,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 1, 1],5,),
    ([62, 36, 39, 53, 90, 78, 56, 1, 56, 4, 30],8,)
        ]
    filled_function_param = [
    ([8, 11, 18, 23, 24, 28, 28, 34, 35, 42, 44, 53, 57, 65, 71, 72, 76, 78, 82, 82, 85, 86, 92, 93],15,),
    ([0, -95, -51, -2, -70, -28, 3, -37, 75, -74, 85, -63, -93, 27, 68, -8, 67, 90, 3, -47, 32, 8, 12, 53, -93, 56, 97],15,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],40,),
    ([28, 85, 78, 33, 10, 83, 30, 22, 3, 82, 75, 48, 2, 76, 54, 6, 40, 93, 94],10,),
    ([-98, -94, -7, -3, 1, 11, 11, 83, 88],7,),
    ([0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0],35,),
    ([8, 35, 37, 38, 39, 46, 49, 54],6,),
    ([-60, -66, -4, -21, 27, -83, 61, 75, 10, -48, 18, -91, -67, 88, 13, 49, 86, -15, 97, -90, -94, 15, 21, 41, -35, -80, -43, -54],21,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 1, 1],5,),
    ([62, 36, 39, 53, 90, 78, 56, 1, 56, 4, 30],8,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            f_gold(*parameters_set)
            print("POSITIVE_ELEMENTS_EVEN_NEGATIVE_ODD_POSITIONS," + sys.argv[1] + "," + str(i) + "," + ','.join(str(e) for e in parameters_set).replace(',', ';'))
        except:
            print("POSITIVE_ELEMENTS_EVEN_NEGATIVE_ODD_POSITIONS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
