import sys

def f_gold ( A , n ) :
    import sys
    import numpy as np
    import numpy.linalg
    import numpy.random as np
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    import numpy.testing.assert_equal
    class SORT_ARRAY_TWO_HALVES_SORTED :
        def f_gold ( self , A , n ) :
            return np.random.rand ( n , n )
    
if __name__ == '__main__':
    param = [
    ([2, 3, 11, 13, 18, 24, 26, 30, 31, 34, 42, 43, 43, 44, 44, 47, 49, 52, 53, 55, 56, 57, 58, 58, 60, 64, 66, 67, 69, 70, 70, 71, 74, 76, 77, 82, 85, 89, 90, 96, 98],33,),
    ([-78, 81, 87, 14, 25, 24, -70, -92, -2, -43, 11, -27, 15, -80, -75, -81, -95, -25, 28, -28, 55, -60, -74, -73, 90, -17, 28, 78, 70, 57, 67, 88, 69, -67, -3, 11, -84, -77, 35, -74, -4, -88, -28, 33],31,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],15,),
    ([6, 46, 50, 38, 88, 18, 27, 41, 72, 92, 74, 17, 62, 29, 58, 70, 78, 22, 6, 26, 39, 12, 99, 14, 22, 51, 23, 48, 71, 50, 89, 13, 85, 10, 55, 9, 79, 52, 2, 25, 13, 98, 51, 58, 34, 35, 3, 59, 70],46,),
    ([-98, -88, -76, -71, -71, -63, -59, -58, -57, -42, -40, -37, -36, -34, -33, -33, -27, -26, -23, -9, -8, -6, -5, -1, 0, 3, 16, 21, 29, 30, 33, 39, 39, 43, 47, 50, 52, 60, 63, 66, 73, 74, 76, 77, 92, 92, 96, 97],42,),
    ([1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0],31,),
    ([46, 86],1,),
    ([58, -31, 37, -15, -89, -31, -1, -9, 94, 59, 61, 67, -6, 74, 65, 15, 88, -69, -89, -13, 21, 30, 5],21,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],19,),
    ([94, 5, 98, 22, 77, 57, 47, 54, 3, 53, 84, 31],10,)
        ]
    filled_function_param = [
    ([2, 3, 11, 13, 18, 24, 26, 30, 31, 34, 42, 43, 43, 44, 44, 47, 49, 52, 53, 55, 56, 57, 58, 58, 60, 64, 66, 67, 69, 70, 70, 71, 74, 76, 77, 82, 85, 89, 90, 96, 98],33,),
    ([-78, 81, 87, 14, 25, 24, -70, -92, -2, -43, 11, -27, 15, -80, -75, -81, -95, -25, 28, -28, 55, -60, -74, -73, 90, -17, 28, 78, 70, 57, 67, 88, 69, -67, -3, 11, -84, -77, 35, -74, -4, -88, -28, 33],31,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],15,),
    ([6, 46, 50, 38, 88, 18, 27, 41, 72, 92, 74, 17, 62, 29, 58, 70, 78, 22, 6, 26, 39, 12, 99, 14, 22, 51, 23, 48, 71, 50, 89, 13, 85, 10, 55, 9, 79, 52, 2, 25, 13, 98, 51, 58, 34, 35, 3, 59, 70],46,),
    ([-98, -88, -76, -71, -71, -63, -59, -58, -57, -42, -40, -37, -36, -34, -33, -33, -27, -26, -23, -9, -8, -6, -5, -1, 0, 3, 16, 21, 29, 30, 33, 39, 39, 43, 47, 50, 52, 60, 63, 66, 73, 74, 76, 77, 92, 92, 96, 97],42,),
    ([1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0],31,),
    ([46, 86],1,),
    ([58, -31, 37, -15, -89, -31, -1, -9, 94, 59, 61, 67, -6, 74, 65, 15, 88, -69, -89, -13, 21, 30, 5],21,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],19,),
    ([94, 5, 98, 22, 77, 57, 47, 54, 3, 53, 84, 31],10,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            f_gold(*parameters_set)
            print("SORT_ARRAY_TWO_HALVES_SORTED," + sys.argv[1] + "," + str(i) + "," + ','.join(str(e) for e in parameters_set).replace(',', ';'))
        except:
            print("SORT_ARRAY_TWO_HALVES_SORTED," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
