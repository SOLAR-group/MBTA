if __name__ == '__main__':
    param = [
    (48,),
    (42,),
    (15,),
    (75,),
    (23,),
    (41,),
    (46,),
    (99,),
    (36,),
    (53,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_BINOMIAL_COEFFICIENTS_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_BINOMIAL_COEFFICIENTS_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_BINOMIAL_COEFFICIENTS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
