if __name__ == '__main__':
    param = [
    (60,),
    (44,),
    (72,),
    (90,),
    (99,),
    (45,),
    (27,),
    (11,),
    (65,),
    (52,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
