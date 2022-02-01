if __name__ == '__main__':
    param = [
    (60,),
    (20,),
    (33,),
    (34,),
    (68,),
    (79,),
    (20,),
    (41,),
    (36,),
    (17,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
