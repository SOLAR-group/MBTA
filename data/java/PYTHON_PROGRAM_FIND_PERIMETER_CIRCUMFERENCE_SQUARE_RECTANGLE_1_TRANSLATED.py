import sys

def f_gold ( l , w ) :
    return ( 2 * ( l + w ) , l + w )

if __name__ == '__main__':
    param = [
    (58,39,),
    (37,49,),
    (56,52,),
    (22,43,),
    (77,12,),
    (34,31,),
    (74,54,),
    (37,52,),
    (21,37,),
    (75,30,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PYTHON_PROGRAM_FIND_PERIMETER_CIRCUMFERENCE_SQUARE_RECTANGLE_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PYTHON_PROGRAM_FIND_PERIMETER_CIRCUMFERENCE_SQUARE_RECTANGLE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
