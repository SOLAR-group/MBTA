if __name__ == '__main__':
    param = [
    (61,),
    (22,),
    (65,),
    (57,),
    (36,),
    (25,),
    (16,),
    (26,),
    (92,),
    (5,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_NUMBER_OF_WAYS_TO_FILL_A_N_X_4_GRID_USING_1_X_4_TILES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_NUMBER_OF_WAYS_TO_FILL_A_N_X_4_GRID_USING_1_X_4_TILES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_NUMBER_OF_WAYS_TO_FILL_A_N_X_4_GRID_USING_1_X_4_TILES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
