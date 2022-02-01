if __name__ == '__main__':
    param = [
    (64,),
    (36,),
    (21,),
    (3,),
    (18,),
    (82,),
    (76,),
    (99,),
    (70,),
    (31,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SELECT_A_RANDOM_NUMBER_FROM_STREAM_WITH_O1_SPACE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SELECT_A_RANDOM_NUMBER_FROM_STREAM_WITH_O1_SPACE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SELECT_A_RANDOM_NUMBER_FROM_STREAM_WITH_O1_SPACE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
