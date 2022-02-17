====================
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

