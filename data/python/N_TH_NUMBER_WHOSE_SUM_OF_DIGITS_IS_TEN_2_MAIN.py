if __name__ == '__main__':
    param = [
    (68,),
    (70,),
    (69,),
    (93,),
    (99,),
    (44,),
    (91,),
    (8,),
    (83,),
    (51,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
