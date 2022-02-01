if __name__ == '__main__':
    param = [
    (59,),
    (7,),
    (90,),
    (78,),
    (49,),
    (15,),
    (45,),
    (56,),
    (7,),
    (70,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
