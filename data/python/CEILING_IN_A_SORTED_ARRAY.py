import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , low , high , x ) :
    if x <= arr [ low ] :
        return low
    i = low
    for i in range ( high ) :
        if arr [ i ] == x :
            return i
        if arr [ i ] < x and arr [ i + 1 ] >= x :
            return i + 1
    return - 1


#TOFILL
if __name__ == '__main__':
    param = [
    ([2, 3, 4, 6, 8, 9, 9, 10, 11, 16, 19, 20, 21, 21, 21, 24, 24, 25, 28, 30, 30, 30, 32, 34, 35, 39, 41, 42, 49, 52, 57, 59, 61, 62, 66, 68, 71, 73, 76, 79, 83, 84, 85, 86, 87, 87],23,37,44,),
    ([92, 50, -84, 60, 32, -54, 84, -82, -42, -72, -64, -28, -48, 66, 92, -42, 42, -66, 52, -30, 48, 42, 36, -4, 64, 62, -16, 0, 20, 26, 78, 78, 12, -6, -30, -14, 76, 72, 70, -34, 98, 32],36,35,34,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1],11,9,13,),
    ([26, 68, 73, 76, 14, 19, 56, 80, 17, 7, 15, 64, 99, 98, 21, 21, 72, 12, 14, 10, 44, 82, 25, 42, 46, 86, 79, 43, 91],23,27,26,),
    ([-90, -86, -84, -50, -30, -24, -12, -2, 8, 22, 30, 44, 58, 58, 60, 60, 62, 90],9,16,10,),
    ([0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1],12,15,18,),
    ([2, 2, 29, 31, 34, 39, 48, 50, 56, 61, 66, 66, 69, 73, 88],9,12,10,),
    ([-98, 48, -58, 8, 70, 62, 92, 84, -58, -46, -26, -92, 18, -88, 40, -12, 60, 14, 54, -64, 88, 52, -44, 88, -46, -8, 36, -22, 28, -20, -50, 58, -82, -44, -44, 54, -86, 40, 10, 0, -24, -84, -10, 62, 58, 0, -88],40,29,24,),
    ([0, 0, 0, 0, 1, 1],5,5,5,),
    ([56, 30, 33, 5, 67, 35, 22, 54, 36, 55, 94, 89, 40, 65, 29, 76, 17, 14, 14, 49, 40, 44, 35, 69, 63, 2, 81, 78, 19, 67, 12, 14, 68, 30, 82, 85, 12, 2, 94, 33, 85, 75, 97, 31, 69, 31, 85, 26],46,47,47,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CEILING_IN_A_SORTED_ARRAY," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CEILING_IN_A_SORTED_ARRAY," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
