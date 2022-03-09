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
    class PROBABILITY_THREE_RANDOMLY_CHOSEN_NUMBERS_AP :
        def f_gold ( self , n ) :
            return ( 3.0 * n ) / ( 4.0 * ( n ** 2 ) - 1 )
    return PROBABILITY_THREE_RANDOMLY_CHOSEN_NUMBERS_AP

if __name__ == '__main__':
    param = [
    (46,),
    (5,),
    (44,),
    (15,),
    (72,),
    (2,),
    (86,),
    (17,),
    (30,),
    (42,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROBABILITY_THREE_RANDOMLY_CHOSEN_NUMBERS_AP," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROBABILITY_THREE_RANDOMLY_CHOSEN_NUMBERS_AP," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
