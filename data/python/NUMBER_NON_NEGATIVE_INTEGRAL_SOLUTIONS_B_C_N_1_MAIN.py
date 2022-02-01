if __name__ == '__main__':
    param = [
    (41,),
    (72,),
    (54,),
    (75,),
    (87,),
    (41,),
    (78,),
    (80,),
    (46,),
    (9,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
