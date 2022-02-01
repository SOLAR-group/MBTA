if __name__ == '__main__':
    param = [
    (60,71,),
    (56,17,),
    (16,16,),
    (42,60,),
    (55,56,),
    (64,59,),
    (68,24,),
    (88,2,),
    (64,94,),
    (42,79,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("STRING_K_DISTINCT_CHARACTERS_NO_CHARACTERS_ADJACENT," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("STRING_K_DISTINCT_CHARACTERS_NO_CHARACTERS_ADJACENT," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("STRING_K_DISTINCT_CHARACTERS_NO_CHARACTERS_ADJACENT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
