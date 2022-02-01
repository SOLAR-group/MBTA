if __name__ == '__main__':
    param = [
    (24,),
    (1,),
    (91,),
    (90,),
    (89,),
    (29,),
    (3,),
    (60,),
    (75,),
    (14,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FRIENDS_PAIRING_PROBLEM_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FRIENDS_PAIRING_PROBLEM_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FRIENDS_PAIRING_PROBLEM_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
