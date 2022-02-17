====================
def get_f_gold ( s ) :
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

