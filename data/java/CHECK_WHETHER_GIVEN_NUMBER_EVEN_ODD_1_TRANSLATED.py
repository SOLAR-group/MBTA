import sys

def f_gold ( n ) :
    import sys
    import os
    import pickle
    import math
    import random
    import functools
    class CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD_1 :
        def f_gold ( self , n ) :
            if ( n & 1 ) == 0 :
                return True
            else :
                return False
    return CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD_1

if __name__ == '__main__':
    param = [
    (57,),
    (73,),
    (79,),
    (36,),
    (71,),
    (23,),
    (41,),
    (66,),
    (46,),
    (50,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
