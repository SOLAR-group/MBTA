import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(arr, n, k):
    for i in range(n - 1):
        pos = i
        for j in range(i + 1, n):
            if (j - i > k):
                break
            if (arr[j] < arr[pos]):
                pos = j
        for j in range(pos, i, - 1):
            arr[j], arr[j - 1] = arr[j - 1], arr[j]
        k -= pos - i


#TOFILL
if __name__ == '__main__':
    param = [
        ([4, 6, 6, 10, 12, 13, 17, 18, 21, 25, 30, 30, 32, 33, 36, 36, 37, 39, 41, 42, 42, 43, 47,
          49, 50, 54, 54, 55, 59, 71, 72, 73, 74, 79, 80, 82, 83, 86, 89, 90, 92, 97, 98], 26, 25,),
        ([-84, 0, 8, 42, 0, 44, -74, -24, 94, -90, -60, 90, -14, -22, -98, 38, -72, -94, 92, 94, -64, 92, -22, -36, 34,
          68, -96, -34, -40, 28, 76, 68, -28, 2, -98, -24, -66, 40, 22, 84, 28, 48, 12, 98, 6, 2, -74, 86, 98], 33, 37,),
        ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,
          1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], 35, 40,),
        ([6], 0, 0,),
        ([-26], 0, 0,),
        ([1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0], 7, 11,),
        ([6, 23, 34, 37, 37, 38, 39, 45, 56, 56, 57, 59, 60,
          65, 67, 68, 69, 71, 82, 85, 89, 94, 97, 99], 12, 18,),
        ([10, 18, 72, 42, 34, 0, -86, -96, -88, -66, -62, -30, 72, 56, -42, -54, -24, -6, -98, 10, -96, 22, -30, 58, -
          48, -14, -96, -42, -76, 82, 2, 44, 64, -48, 96, 46, -50, 42, -46, -94, 78, 82, 20, -46, -44, -80, 12], 32, 46,),
        ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,
          1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], 19, 21,),
        ([84, 84, 82, 82, 54, 12, 68, 59, 21, 6, 16, 80, 6, 30, 12, 95, 96, 63, 37, 15, 41, 40, 88, 3,
          49, 37, 8, 24, 36, 65, 47, 67, 78, 36, 6, 58, 66, 75, 71, 14, 99, 14, 56, 50, 85, 33], 30, 32,)
    ]
    filled_function_param = [
        ([4, 6, 6, 10, 12, 13, 17, 18, 21, 25, 30, 30, 32, 33, 36, 36, 37, 39, 41, 42, 42, 43, 47,
          49, 50, 54, 54, 55, 59, 71, 72, 73, 74, 79, 80, 82, 83, 86, 89, 90, 92, 97, 98], 26, 25,),
        ([-84, 0, 8, 42, 0, 44, -74, -24, 94, -90, -60, 90, -14, -22, -98, 38, -72, -94, 92, 94, -64, 92, -22, -36, 34,
          68, -96, -34, -40, 28, 76, 68, -28, 2, -98, -24, -66, 40, 22, 84, 28, 48, 12, 98, 6, 2, -74, 86, 98], 33, 37,),
        ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,
          1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], 35, 40,),
        ([6], 0, 0,),
        ([-26], 0, 0,),
        ([1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0], 7, 11,),
        ([6, 23, 34, 37, 37, 38, 39, 45, 56, 56, 57, 59, 60,
          65, 67, 68, 69, 71, 82, 85, 89, 94, 97, 99], 12, 18,),
        ([10, 18, 72, 42, 34, 0, -86, -96, -88, -66, -62, -30, 72, 56, -42, -54, -24, -6, -98, 10, -96, 22, -30, 58, -
          48, -14, -96, -42, -76, 82, 2, 44, 64, -48, 96, 46, -50, 42, -46, -94, 78, 82, 20, -46, -44, -80, 12], 32, 46,),
        ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,
          1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], 19, 21,),
        ([84, 84, 82, 82, 54, 12, 68, 59, 21, 6, 16, 80, 6, 30, 12, 95, 96, 63, 37, 15, 41, 40, 88, 3,
          49, 37, 8, 24, 36, 65, 47, 67, 78, 36, 6, 58, 66, 75, 71, 14, 99, 14, 56, 50, 85, 33], 30, 32,)
    ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            f_gold(*parameters_set)
            print("LEXICOGRAPHICALLY_SMALLEST_ARRAY_K_CONSECUTIVE_SWAPS," + sys.argv[1] + "," + str(i) + "," + ','.join(str(e) for e in parameters_set).replace(',', ';'))
        except:
            print("LEXICOGRAPHICALLY_SMALLEST_ARRAY_K_CONSECUTIVE_SWAPS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
