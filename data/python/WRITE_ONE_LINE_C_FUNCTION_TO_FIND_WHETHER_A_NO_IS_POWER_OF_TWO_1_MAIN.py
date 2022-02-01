if __name__ == '__main__':
    param = [
    (1,),
    (2,),
    (8,),
    (1024,),
    (24,),
    (7,),
    (46,),
    (61,),
    (73,),
    (66,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("WRITE_ONE_LINE_C_FUNCTION_TO_FIND_WHETHER_A_NO_IS_POWER_OF_TWO_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("WRITE_ONE_LINE_C_FUNCTION_TO_FIND_WHETHER_A_NO_IS_POWER_OF_TWO_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("WRITE_ONE_LINE_C_FUNCTION_TO_FIND_WHETHER_A_NO_IS_POWER_OF_TWO_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
