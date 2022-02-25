import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    found = True
    for i in range ( 0 , n - 2 ) :
        for j in range ( i + 1 , n - 1 ) :
            for k in range ( j + 1 , n ) :
                if ( arr [ i ] + arr [ j ] + arr [ k ] == 0 ) :
                    
                    found = True
    if ( found == False ) :
        return
        


#TOFILL
if __name__ == '__main__':
    param = [
    ([12, 15, 17, 26, 29, 30, 31, 45, 48, 49, 51, 58, 63, 68, 69, 76, 80, 82, 83, 83, 85, 87],13,),
    ([-96, 22, -8, -66, -92, 48, -42, -96, -76, -8, -46, -28, -82, 24, 58, -42, -8, -8, -40, 38, -74, -76, -72, -6, -4, 86, 52, 80, -80],14,),
    ([1],0,),
    ([3],0,),
    ([-96, -92, -90, -90, -88, -86, -74, -60, -40, -40, -40, -40, -36, -34, -28, -22, -18, -18, -14, -10, -6, -4, 14, 24, 24, 34, 50, 60, 72, 98],22,),
    ([1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0],13,),
    ([5, 6, 8, 13, 18, 18, 19, 22, 22, 26, 31, 31, 34, 37, 39, 41, 44, 44, 46, 50, 55, 55, 56, 56, 57, 59, 60, 62, 63, 65, 65, 66, 69, 71, 72, 74, 75, 83, 85, 88, 91, 97, 99, 99, 99],24,),
    ([46, 92, 40, 24, 4, 16, 14, -46, 48, -32, -84, -68, -60, 20, -54, -32, 22, -70, 92, -20, -22, 78, 86, 58, -70, 64],16,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],25,),
    ([17, 60],1,)
        ]
    filled_function_param = [
    ([12, 15, 17, 26, 29, 30, 31, 45, 48, 49, 51, 58, 63, 68, 69, 76, 80, 82, 83, 83, 85, 87],13,),
    ([-96, 22, -8, -66, -92, 48, -42, -96, -76, -8, -46, -28, -82, 24, 58, -42, -8, -8, -40, 38, -74, -76, -72, -6, -4, 86, 52, 80, -80],14,),
    ([1],0,),
    ([3],0,),
    ([-96, -92, -90, -90, -88, -86, -74, -60, -40, -40, -40, -40, -36, -34, -28, -22, -18, -18, -14, -10, -6, -4, 14, 24, 24, 34, 50, 60, 72, 98],22,),
    ([1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0],13,),
    ([5, 6, 8, 13, 18, 18, 19, 22, 22, 26, 31, 31, 34, 37, 39, 41, 44, 44, 46, 50, 55, 55, 56, 56, 57, 59, 60, 62, 63, 65, 65, 66, 69, 71, 72, 74, 75, 83, 85, 88, 91, 97, 99, 99, 99],24,),
    ([46, 92, 40, 24, 4, 16, 14, -46, 48, -32, -84, -68, -60, 20, -54, -32, 22, -70, 92, -20, -22, 78, 86, 58, -70, 64],16,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],25,),
    ([17, 60],1,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            f_gold(*parameters_set)
            print("FIND_TRIPLETS_ARRAY_WHOSE_SUM_EQUAL_ZERO," + sys.argv[1] + "," + str(i) + "," + ','.join(str(e) for e in parameters_set).replace(',', ';'))
        except:
            print("FIND_TRIPLETS_ARRAY_WHOSE_SUM_EQUAL_ZERO," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
