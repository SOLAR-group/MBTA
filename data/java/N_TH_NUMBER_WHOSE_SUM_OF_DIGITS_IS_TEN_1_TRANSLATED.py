====================
def f_gold ( n ) :
    import sys
    import os
    import pickle
    import math
    import random
    import itertools
    import functools
    class N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_1 :
        def f_gold ( self , n ) :
            count = 0
            for curr in range ( 19 , - 9 , - 1 ) :
                sum = 0
                for x in range ( curr , 0 , - 1 ) :
                    sum = sum + x % 10
                if sum == 10 :
                    count += 1
                if count == n :
                    return curr
    return N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_1
