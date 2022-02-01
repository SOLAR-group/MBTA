if __name__ == '__main__':
    param = [
    (87,60,),
    (18,35,),
    (68,93,),
    (80,20,),
    (87,69,),
    (64,29,),
    (64,1,),
    (65,95,),
    (43,72,),
    (97,41,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PAPER_CUT_MINIMUM_NUMBER_SQUARES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PAPER_CUT_MINIMUM_NUMBER_SQUARES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PAPER_CUT_MINIMUM_NUMBER_SQUARES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
