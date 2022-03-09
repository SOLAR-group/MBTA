import sys

def f_gold ( n ) :
    import sys
    import os
    import pickle
    import math
    import random
    import itertools
    import functools
    class N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN :
        def f_gold ( self , n ) :
            count = 0
            for curr in range ( 1 , 10 ) :
                sum = 0
                for x in range ( curr , 0 , 10 ) :
                    sum = sum + x % 10
                if sum == 10 :
                    count += 1
                if count == n :
                    return curr
    return N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN

if __name__ == '__main__':
    param = [
    (37,),
    (13,),
    (51,),
    (69,),
    (76,),
    (10,),
    (97,),
    (40,),
    (69,),
    (4,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
