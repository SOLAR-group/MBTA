if __name__ == '__main__':
    param = [
    (13,),
    (27,),
    (1,),
    (24,),
    (98,),
    (94,),
    (36,),
    (41,),
    (74,),
    (39,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
