import sys

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
    
if __name__ == '__main__':
    param = [
    ([4, 5, 7, 12, 23, 31, 31, 45, 47, 60, 67, 70, 84, 85, 91, 96],11,),
    ([-88, -38, -50, -14, 36, -32, 0, -8, -12, -62, -46, 66, -46, -26, 6, -44, 14, -74, -84, 52, -28],18,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],39,),
    ([85, 42, 7, 35, 35, 21, 97, 59, 88, 50, 12, 44, 85, 22, 38, 23, 42, 61, 44, 63, 23, 69, 28, 17, 73, 20, 71, 80, 15, 42, 28, 10, 56, 77, 43],26,),
    ([-92, -82, -82, -74, -72, -68, -68, -66, -60, -54, -42, -38, -36, -32, -30, -16, -14, -12, -10, 14, 24, 28, 34, 34, 38, 42, 44, 52, 70, 72, 80, 84, 86, 94],32,),
    ([0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0],8,),
    ([33],0,),
    ([76, 86, 46, -70, 92, 6, 70, -66, 64, 46, 86, -42, -46, -24, 8, 76, 4, -96, -86, 18, 70, -72, -56, -88, -96, 62, 22, 20, 42],21,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],24,),
    ([25, 46, 41, 61, 93, 29, 65, 24, 10, 89, 22, 51, 18, 65, 70, 59, 87, 82, 97, 99, 15, 64, 20, 97, 12, 23, 76],20,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DYNAMIC_PROGRAMMING_SET_14_MAXIMUM_SUM_INCREASING_SUBSEQUENCE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DYNAMIC_PROGRAMMING_SET_14_MAXIMUM_SUM_INCREASING_SUBSEQUENCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
