import sys

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

if __name__ == '__main__':
    param = [
    ([7, 26, 26, 48, 59, 62, 66, 70, 72, 75, 76, 81, 97, 98],7,),
    ([-42, -48, -64, -74, 56, -34, 20, 16, 34, -84, 86, 38, 56, -86, 30, -74, -96, 96, 12, 10, -46, 10, -36, 38, 34, -46, -20, 14, 12, 62, -54, 20, -82, 24, 96],27,),
    ([0, 0, 1, 1],3,),
    ([68, 91, 61, 6, 32, 47, 76, 69, 44, 71, 29, 79, 74, 33, 44, 33, 45, 75, 43, 82, 83, 81, 95, 16, 86, 33, 69, 61, 73, 21, 54, 17, 98, 62, 14, 72, 80, 31, 56, 82, 14, 48, 76],38,),
    ([-98, -96, -92, -62, -52, -42, -42, -26, 4, 10, 14, 38, 64, 66, 72, 74, 82],14,),
    ([0, 1, 1, 1, 0, 0, 0, 1, 0, 1],5,),
    ([53, 63, 63],2,),
    ([-96, -38, -26, -46, 68, -36, 20, -18, -10, 52, 40, 94, -8, -64, 82, -22],15,),
    ([0, 0, 0, 0, 0, 1, 1],3,),
    ([99, 46, 48, 81, 27, 97, 26, 50, 77, 32, 45, 99, 46],12,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_THE_ELEMENT_THAT_APPEARS_ONCE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_THE_ELEMENT_THAT_APPEARS_ONCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
