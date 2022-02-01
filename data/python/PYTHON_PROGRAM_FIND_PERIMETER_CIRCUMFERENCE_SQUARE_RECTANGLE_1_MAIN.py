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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PYTHON_PROGRAM_FIND_PERIMETER_CIRCUMFERENCE_SQUARE_RECTANGLE_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PYTHON_PROGRAM_FIND_PERIMETER_CIRCUMFERENCE_SQUARE_RECTANGLE_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PYTHON_PROGRAM_FIND_PERIMETER_CIRCUMFERENCE_SQUARE_RECTANGLE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
