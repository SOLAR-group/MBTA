if __name__ == '__main__':
    param = [
    (85,),
    (86,),
    (3,),
    (35,),
    (59,),
    (38,),
    (33,),
    (15,),
    (75,),
    (74,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_NUMBERS_THAT_DONT_CONTAIN_3," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_NUMBERS_THAT_DONT_CONTAIN_3," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_NUMBERS_THAT_DONT_CONTAIN_3," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
