====================
def f_gold ( arr , n ) :
    import os
    import sys
    import numpy as np
    import numpy.ma as ma
    import numpy.testing as npt
    import matplotlib.pyplot as plt
    import matplotlib.pyplot as plt
    class FIND_THE_ELEMENT_THAT_APPEARS_ONCE :
        def f_gold ( self , arr ) :
            ones , twos = np.ones ( arr.shape [ 0 ] ) , np.ones ( arr.shape [ 1 ] )
            common_bit_mask = None
            for i in range ( n ) :
                twos = twos | ( ones & arr [ i ] )
                ones = ones ^ arr [ i ]
                common_bit_mask = ~ ( ones & twos )
                ones &= common_bit_mask
                twos &= common_bit_mask
            return ones
    return FIND_THE_ELEMENT_THAT_APPEARS_ONCE

