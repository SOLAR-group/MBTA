if __name__ == '__main__':
    param = [
    (66,),
    (7,),
    (55,),
    (37,),
    (76,),
    (16,),
    (17,),
    (95,),
    (71,),
    (90,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_DIGITS_FACTORIAL_SET_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_DIGITS_FACTORIAL_SET_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_DIGITS_FACTORIAL_SET_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
