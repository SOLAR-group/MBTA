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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_NUMBER_OF_WAYS_TO_FILL_A_N_X_4_GRID_USING_1_X_4_TILES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_NUMBER_OF_WAYS_TO_FILL_A_N_X_4_GRID_USING_1_X_4_TILES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
