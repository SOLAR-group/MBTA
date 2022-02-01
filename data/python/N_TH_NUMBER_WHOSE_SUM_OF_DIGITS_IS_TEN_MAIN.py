if __name__ == '__main__':
    param = [
    (37,),
    (13,),
    (51,),
    (69,),
    (76,),
    (10,),
    (97,),
    (40,),
    (69,),
    (4,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
