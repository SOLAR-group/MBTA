if __name__ == '__main__':
    param = [
    (97,91,),
    (52,49,),
    (95,34,),
    (35,40,),
    (40,85,),
    (18,97,),
    (92,15,),
    (73,98,),
    (10,62,),
    (82,22,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_DIGITS_PRODUCT_TWO_NUMBERS_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_DIGITS_PRODUCT_TWO_NUMBERS_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_DIGITS_PRODUCT_TWO_NUMBERS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
