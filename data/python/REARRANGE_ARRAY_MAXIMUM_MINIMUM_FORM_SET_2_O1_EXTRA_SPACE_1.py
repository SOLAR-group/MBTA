import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    max_ele = arr [ n - 1 ]
    min_ele = arr [ 0 ]
    for i in range ( n ) :
        if i % 2 == 0 :
            arr [ i ] = max_ele
            max_ele -= 1
        else :
            arr [ i ] = min_ele
            min_ele += 1


#TOFILL
if __name__ == '__main__':
    param = [
    ([3, 4, 8, 10, 12, 14, 14, 17, 18, 19, 20, 25, 28, 29, 30, 31, 34, 35, 37, 38, 40, 41, 42, 45, 47, 49, 54, 54, 55, 58, 58, 63, 65, 66, 66, 67, 67, 72, 74, 75, 75, 80, 82, 86, 92, 95, 96, 99],40,),
    ([45, 42, -91, 90, -6, 49, 65, 39, -80, -65, -47, 75, 10, 80, 36, -96, 55, 72, 68, 2, -53, -6, 72, -52, -9, 80, -16, -32, 39, 25, -27, -96, -24, -27, -23, -52],23,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],28,),
    ([12, 84, 16],2,),
    ([-85, -77, -70, -67, -55, -51, -49, -41, -37, -24, -18, -8, -6, 77, 87, 90],13,),
    ([0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0],12,),
    ([5, 8, 15, 16, 20, 22, 25, 33, 46, 48, 52, 54, 55, 57, 57, 61, 61, 66, 72, 73, 83, 87, 88, 89, 98],12,),
    ([31, 2, -46, -86, -64, 5, -18, -33, -90, -51, 11, -35, -43, -73, 13, 33, -29, -17, -43, 20, -7, -85],13,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],31,),
    ([20, 75, 12, 62, 18, 94, 63, 84, 25, 12],9,)
        ]
    filled_function_param = [
    ([3, 4, 8, 10, 12, 14, 14, 17, 18, 19, 20, 25, 28, 29, 30, 31, 34, 35, 37, 38, 40, 41, 42, 45, 47, 49, 54, 54, 55, 58, 58, 63, 65, 66, 66, 67, 67, 72, 74, 75, 75, 80, 82, 86, 92, 95, 96, 99],40,),
    ([45, 42, -91, 90, -6, 49, 65, 39, -80, -65, -47, 75, 10, 80, 36, -96, 55, 72, 68, 2, -53, -6, 72, -52, -9, 80, -16, -32, 39, 25, -27, -96, -24, -27, -23, -52],23,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],28,),
    ([12, 84, 16],2,),
    ([-85, -77, -70, -67, -55, -51, -49, -41, -37, -24, -18, -8, -6, 77, 87, 90],13,),
    ([0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0],12,),
    ([5, 8, 15, 16, 20, 22, 25, 33, 46, 48, 52, 54, 55, 57, 57, 61, 61, 66, 72, 73, 83, 87, 88, 89, 98],12,),
    ([31, 2, -46, -86, -64, 5, -18, -33, -90, -51, 11, -35, -43, -73, 13, 33, -29, -17, -43, 20, -7, -85],13,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],31,),
    ([20, 75, 12, 62, 18, 94, 63, 84, 25, 12],9,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            f_gold(*parameters_set)
            print("REARRANGE_ARRAY_MAXIMUM_MINIMUM_FORM_SET_2_O1_EXTRA_SPACE_1," + sys.argv[1] + "," + str(i) + "," + ','.join(str(e) for e in parameters_set).replace(',', ';'))
        except:
            print("REARRANGE_ARRAY_MAXIMUM_MINIMUM_FORM_SET_2_O1_EXTRA_SPACE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
