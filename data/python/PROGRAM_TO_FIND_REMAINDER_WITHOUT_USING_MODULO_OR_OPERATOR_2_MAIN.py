if __name__ == '__main__':
    param = [
    (70,13,),
    (77,3,),
    (77,73,),
    (88,54,),
    (96,39,),
    (6,10,),
    (79,95,),
    (44,32,),
    (26,86,),
    (82,91,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")