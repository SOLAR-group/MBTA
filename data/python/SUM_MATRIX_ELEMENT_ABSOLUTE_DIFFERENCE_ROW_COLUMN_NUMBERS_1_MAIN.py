if __name__ == '__main__':
    param = [
    (63,),
    (72,),
    (28,),
    (35,),
    (6,),
    (70,),
    (20,),
    (8,),
    (8,),
    (35,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
