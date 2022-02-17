====================
def f_gold ( arr , n ) :
    import sys
    import getopt
    import numpy as np
    import numpy.ma as ma
    import numpy.testing as npt
    import numpy.random as np
    import numpy.testing.utils as npt
    class DYNAMIC_PROGRAMMING_SET_14_MAXIMUM_SUM_INCREASING_SUBSEQUENCE :
        def f_gold ( self , arr ) :
            msis = np.zeros ( n )
            for i in range ( n ) :
                msis [ i ] = arr [ i ]
            for i in range ( 1 , n ) :
                for j in range ( i ) :
                    if arr [ i ] > arr [ j ] and msis [ i ] < msis [ j ] + arr [ i ] :
                        msis [ i ] = msis [ j ] + arr [ i ]
                for i in range ( 0 , n ) :
                    if max ( msis ) < max ( msis ) :
                        max = msis
                return max
    
