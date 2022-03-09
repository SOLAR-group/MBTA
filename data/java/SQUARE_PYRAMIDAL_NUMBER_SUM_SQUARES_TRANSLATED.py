import sys

def f_gold ( s ) :
    import sys
    import os
    import pickle
    import math
    import pickle
    import pickle.dump
    import pickle.load
    import pickle.reduce
    import pickle.zip
    import pickle.zip
    class SQUARE_PYRAMIDAL_NUMBER_SUM_SQUARES :
        def f_gold ( s ) :
            sum = 0
            for n in range ( 1 , s ) :
                sum += n ** 2
                if sum == s :
                    return n
            return - 1
    return SQUARE_PYRAMIDAL_NUMBER_SUM_SQUARES

if __name__ == '__main__':
    param = [
    (1,),
    (5,),
    (14,),
    (140,),
    (204,),
    (3,),
    (506,),
    (42,),
    (4,),
    (87,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SQUARE_PYRAMIDAL_NUMBER_SUM_SQUARES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SQUARE_PYRAMIDAL_NUMBER_SUM_SQUARES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
