import sys

def f_gold ( n ) :
    import sys
    import numpy as np
    import numpy.linalg
    import numpy.random as np
    import numpy.testing.utils as npt
    import matplotlib.pyplot as plt
    class NUMBER_OF_TRIANGLES_IN_A_PLANE_IF_NO_MORE_THAN_TWO_POINTS_ARE_COLLINEAR :
        def f_gold ( self , n ) :
            return n * ( n - 1 ) * ( n - 2 ) / 6
    return np.random.rand ( NUMBER_OF_TRIANGLES_IN_A_PLANE_IF_NO_MORE_THAN_TWO_POINTS_ARE_COLLINEAR

if __name__ == '__main__':
    param = [
    (67,),
    (58,),
    (67,),
    (60,),
    (4,),
    (97,),
    (9,),
    (16,),
    (83,),
    (87,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_OF_TRIANGLES_IN_A_PLANE_IF_NO_MORE_THAN_TWO_POINTS_ARE_COLLINEAR," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_OF_TRIANGLES_IN_A_PLANE_IF_NO_MORE_THAN_TWO_POINTS_ARE_COLLINEAR," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
