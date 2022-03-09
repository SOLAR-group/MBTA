import sys

def f_gold ( n ) :
    import numpy as np
    import scipy.stats
    import scipy.optimize
    import scipy.optimize
    import scipy.optimize
    import scipy.stats
    import scipy.optimize
    import scipy.optimize
    class SUM_OF_ALL_ELEMENTS_UP_TO_NTH_ROW_IN_A_PASCALS_TRIANGLE_1 :
        def f_gold ( self , n ) :
            sum = 0
            sum = 1 << n
            return ( sum - 1 )
    return SUM_OF_ALL_ELEMENTS_UP_TO_NTH_ROW_IN_A_PASCALS_TRIANGLE_1

if __name__ == '__main__':
    param = [
    (53,),
    (3,),
    (28,),
    (44,),
    (84,),
    (83,),
    (46,),
    (3,),
    (16,),
    (89,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_OF_ALL_ELEMENTS_UP_TO_NTH_ROW_IN_A_PASCALS_TRIANGLE_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_OF_ALL_ELEMENTS_UP_TO_NTH_ROW_IN_A_PASCALS_TRIANGLE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
