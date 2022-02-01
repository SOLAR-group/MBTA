if __name__ == '__main__':
    param = [
    (99,),
    (62,),
    (87,),
    (87,),
    (61,),
    (88,),
    (73,),
    (62,),
    (98,),
    (57,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FRIENDS_PAIRING_PROBLEM," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FRIENDS_PAIRING_PROBLEM," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FRIENDS_PAIRING_PROBLEM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
