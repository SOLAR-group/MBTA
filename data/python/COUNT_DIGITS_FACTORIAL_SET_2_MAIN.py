if __name__ == '__main__':
    param = [
    (56,),
    (92,),
    (52,),
    (96,),
    (96,),
    (63,),
    (51,),
    (79,),
    (70,),
    (9,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_DIGITS_FACTORIAL_SET_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_DIGITS_FACTORIAL_SET_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_DIGITS_FACTORIAL_SET_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
