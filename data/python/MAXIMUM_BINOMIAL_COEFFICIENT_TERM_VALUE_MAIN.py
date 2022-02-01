if __name__ == '__main__':
    param = [
    (23,),
    (41,),
    (69,),
    (56,),
    (71,),
    (38,),
    (26,),
    (52,),
    (93,),
    (44,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MAXIMUM_BINOMIAL_COEFFICIENT_TERM_VALUE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MAXIMUM_BINOMIAL_COEFFICIENT_TERM_VALUE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MAXIMUM_BINOMIAL_COEFFICIENT_TERM_VALUE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
