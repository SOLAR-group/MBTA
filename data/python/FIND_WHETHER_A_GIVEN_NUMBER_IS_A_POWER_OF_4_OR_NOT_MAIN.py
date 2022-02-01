if __name__ == '__main__':
    param = [
    (45,),
    (16,),
    (15,),
    (91,),
    (82,),
    (18,),
    (31,),
    (6,),
    (93,),
    (35,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
