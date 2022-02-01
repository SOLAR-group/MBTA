if __name__ == '__main__':
    param = [
    (34,55,),
    (63,22,),
    (15,26,),
    (56,58,),
    (63,94,),
    (28,45,),
    (54,97,),
    (2,58,),
    (94,91,),
    (82,40,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
