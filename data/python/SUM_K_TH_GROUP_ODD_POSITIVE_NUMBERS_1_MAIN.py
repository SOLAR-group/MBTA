if __name__ == '__main__':
    param = [
    (57,),
    (96,),
    (14,),
    (64,),
    (24,),
    (74,),
    (85,),
    (27,),
    (78,),
    (1,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_K_TH_GROUP_ODD_POSITIVE_NUMBERS_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_K_TH_GROUP_ODD_POSITIVE_NUMBERS_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_K_TH_GROUP_ODD_POSITIVE_NUMBERS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
