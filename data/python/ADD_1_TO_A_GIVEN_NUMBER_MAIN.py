if __name__ == '__main__':
    param = [
    (96,),
    (66,),
    (67,),
    (13,),
    (75,),
    (78,),
    (1,),
    (83,),
    (27,),
    (65,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("ADD_1_TO_A_GIVEN_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("ADD_1_TO_A_GIVEN_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("ADD_1_TO_A_GIVEN_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
