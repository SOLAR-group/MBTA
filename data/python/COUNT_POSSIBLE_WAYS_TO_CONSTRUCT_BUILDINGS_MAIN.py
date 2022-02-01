if __name__ == '__main__':
    param = [
    (17,),
    (66,),
    (53,),
    (97,),
    (34,),
    (54,),
    (9,),
    (99,),
    (59,),
    (87,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_POSSIBLE_WAYS_TO_CONSTRUCT_BUILDINGS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_POSSIBLE_WAYS_TO_CONSTRUCT_BUILDINGS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_POSSIBLE_WAYS_TO_CONSTRUCT_BUILDINGS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
