import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , key ) :
    for i in range ( n ) :
        if ( arr [ i ] == key ) :
            return i
    return - 1


#TOFILL
if __name__ == '__main__':
    param = [
    ([4, 8, 11, 23, 55, 57, 73, 74, 77, 79, 93],8,11,),
    ([-88, 12, -62, -66, -24, 18, 12, 22, 94, 30, -50, -42, -94, 18, 76, -6, -48, -68, 48, 36, -78, 52, -82, 76, 2, -44, -10, 88],27,12,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1],11,0,),
    ([33, 9, 93, 70, 81, 70, 56, 66, 72, 81, 74, 32, 71, 72, 3, 81, 70, 22, 82, 2, 75, 18, 90, 29, 48],24,72,),
    ([-98, -70, -62, -60, -60, -54, -48, -48, -46, -44, -34, -26, -18, -6, 4, 18, 28, 32, 34, 40, 50, 54, 56, 62, 64, 64, 98],18,23,),
    ([1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1],17,16,),
    ([4, 6, 7, 10, 10, 12, 13, 18, 23, 29, 29, 34, 46, 54, 60, 61, 63, 67, 69, 70, 72, 76, 79, 79, 81, 82, 88, 90, 99],15,28,),
    ([94, 34, -60, -74, 86, 80, 68, -48, 78, -62, -98, -44, -44, 92, -94, -86, -36, 12, 84, -90, 52, 42, -42, -66, 88, 76, 66],21,16,),
    ([0, 0, 0, 1],2,3,),
    ([76, 59, 38, 83, 38, 93, 27, 11, 17, 80, 26, 28, 35, 53, 88, 10, 9, 75],12,13,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SEARCH_INSERT_AND_DELETE_IN_AN_UNSORTED_ARRAY," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SEARCH_INSERT_AND_DELETE_IN_AN_UNSORTED_ARRAY," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
