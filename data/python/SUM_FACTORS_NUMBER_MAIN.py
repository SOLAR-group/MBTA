if __name__ == '__main__':
    param = [
    (76,),
    (21,),
    (4,),
    (49,),
    (35,),
    (55,),
    (43,),
    (39,),
    (36,),
    (5,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
