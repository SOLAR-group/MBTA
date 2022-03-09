import sys

def f_gold ( n ) :
    import numpy as np
    import scipy.stats
    import numpy.random as np
    import scipy.optimize
    import scipy.stats as stats
    import scipy.optimize as stats
    class NUMBER_UNIQUE_RECTANGLES_FORMED_USING_N_UNIT_SQUARES :
        def f_gold ( self , n ) :
            ans = 0
            for length in range ( 1 , np.sqrt ( n ) + 1 ) :
                for height in range ( length , length * length <= n ) :
                    ans += 1
                return ans
    return stats.f_gold ( n )

if __name__ == '__main__':
    param = [
    (34,),
    (49,),
    (41,),
    (17,),
    (67,),
    (38,),
    (59,),
    (64,),
    (61,),
    (58,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_UNIQUE_RECTANGLES_FORMED_USING_N_UNIT_SQUARES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_UNIQUE_RECTANGLES_FORMED_USING_N_UNIT_SQUARES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
