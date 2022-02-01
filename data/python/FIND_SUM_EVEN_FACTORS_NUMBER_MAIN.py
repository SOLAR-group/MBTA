if __name__ == '__main__':
    param = [
    (71,),
    (78,),
    (39,),
    (36,),
    (49,),
    (17,),
    (53,),
    (66,),
    (92,),
    (71,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_SUM_EVEN_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_SUM_EVEN_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_SUM_EVEN_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
