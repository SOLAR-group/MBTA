if __name__ == '__main__':
    param = [
    (80,54,),
    (63,21,),
    (1,56,),
    (22,39,),
    (66,7,),
    (61,67,),
    (45,63,),
    (29,44,),
    (95,65,),
    (9,68,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
