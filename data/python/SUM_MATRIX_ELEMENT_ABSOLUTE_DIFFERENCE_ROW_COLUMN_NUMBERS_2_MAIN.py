if __name__ == '__main__':
    param = [
    (12,),
    (89,),
    (76,),
    (2,),
    (81,),
    (11,),
    (26,),
    (35,),
    (16,),
    (66,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
