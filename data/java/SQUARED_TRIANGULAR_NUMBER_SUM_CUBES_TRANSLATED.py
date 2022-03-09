import sys

def f_gold ( s ) :
    import sys
    import os
    import pickle
    import numpy as np
    import numpy.linalg
    import numpy.random
    import numpy.ma as ma
    import numpy.ma as ma
    import numpy.ma as ma
    import numpy.polynomial.polynomial
    import numpy.polynomial.poly1d as poly
    class SQUARED_TRIANGULAR_NUMBER_SUM_CUBES :
        def f_gold ( self , s ) :
            sum = 0
            for n in range ( 1 , s ) :
                sum += n ** 2 * n
                if sum == s :
                    return n
            return - 1
    return SQUARED_TRIANGULAR_NUMBER_SUM_CUBES

if __name__ == '__main__':
    param = [
    (15,),
    (36,),
    (39,),
    (43,),
    (75,),
    (49,),
    (56,),
    (14,),
    (62,),
    (97,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SQUARED_TRIANGULAR_NUMBER_SUM_CUBES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SQUARED_TRIANGULAR_NUMBER_SUM_CUBES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
