if __name__ == '__main__':
    param = [
    (42,),
    (75,),
    (94,),
    (5,),
    (52,),
    (22,),
    (77,),
    (44,),
    (85,),
    (59,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
