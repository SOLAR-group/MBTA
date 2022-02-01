if __name__ == '__main__':
    param = [
    (27,),
    (72,),
    (13,),
    (83,),
    (75,),
    (33,),
    (57,),
    (51,),
    (10,),
    (1,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_STRINGS_WITH_CONSECUTIVE_1S," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_STRINGS_WITH_CONSECUTIVE_1S," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_STRINGS_WITH_CONSECUTIVE_1S," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
