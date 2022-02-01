if __name__ == '__main__':
    param = [
    (20,),
    (68,),
    (52,),
    (61,),
    (3,),
    (88,),
    (41,),
    (78,),
    (94,),
    (18,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("ADD_1_TO_A_GIVEN_NUMBER_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("ADD_1_TO_A_GIVEN_NUMBER_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("ADD_1_TO_A_GIVEN_NUMBER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
