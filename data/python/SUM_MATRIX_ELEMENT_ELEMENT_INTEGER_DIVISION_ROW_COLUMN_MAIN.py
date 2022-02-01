if __name__ == '__main__':
    param = [
    (60,),
    (74,),
    (8,),
    (74,),
    (34,),
    (66,),
    (96,),
    (11,),
    (45,),
    (72,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_MATRIX_ELEMENT_ELEMENT_INTEGER_DIVISION_ROW_COLUMN," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_MATRIX_ELEMENT_ELEMENT_INTEGER_DIVISION_ROW_COLUMN," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_MATRIX_ELEMENT_ELEMENT_INTEGER_DIVISION_ROW_COLUMN," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
