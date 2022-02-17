====================
def f_gold ( arr , n ) :
    import numpy as np
    import pickle
    import numpy as np
    import pickle
    import pickle.dump as pickle
    import pickle.load as pickle
    import pickle.dump as pickle
    import pickle.load as pickle
    import pickle.dump as pickle
    import pickle.load as pickle
    import pickle.dump as pickle
    import pickle.load as pickle
    class MAXIMUM_SUM_BITONIC_SUBARRAY :
        def f_gold ( arr ) :
            msis = [ ]
            msds = [ ]
            max_sum = np.inf
            msis = arr [ 0 ]
            for i in range ( 1 , n ) :
                if arr [ i ] > arr [ i - 1 ] :
                    msis [ i ] = msis [ i - 1 ] + arr [ i ]
                else :
                    msis [ i ] = arr [ i ]
            msds = [ ]
            for i in range ( n - 1 , - 1 , - 1 ) :
                if arr [ i ] > arr [ i + 1 ] :
                    msds [ i ] = msds [ i + 1 ] + arr [ i ]
                else :
                    msds [ i ] = arr [ i ]
            for i in range ( 0 , n ) :
                if max_sum < ( msis [ i ] + msds [ i ] - arr [ i ] ) :
                    max_sum = msis [ i ] + msds [ i ] - arr [ i ]
            return max_sum
    
