import sys

def f_gold ( n , m ) :
    import sys
    import os
    import pickle
    import math
    import random
    import itertools
    import functools
    import collections
    import functools
    class count_number_WAYS_TILE_FLOOR_SIZE_N_X_M_USING_1_X_M_SIZE_TILES :
        count = [ 0 ] * ( n + 1 )
        i = 0
        for i in range ( 1 , n + 1 ) :
            if i > m :
                count [ i ] = count [ i - 1 ] + count [ i - m ]
            elif i < m :
                count [ i ] = 1
            else :
                count [ i ] = 2
        return count [ n ]

if __name__ == '__main__':
    param = [
    (93,54,),
    (17,4,),
    (38,39,),
    (33,64,),
    (78,35,),
    (40,61,),
    (95,6,),
    (12,8,),
    (69,60,),
    (78,21,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_NUMBER_WAYS_TILE_FLOOR_SIZE_N_X_M_USING_1_X_M_SIZE_TILES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_NUMBER_WAYS_TILE_FLOOR_SIZE_N_X_M_USING_1_X_M_SIZE_TILES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
