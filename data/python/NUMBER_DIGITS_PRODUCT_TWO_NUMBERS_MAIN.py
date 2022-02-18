if __name__ == '__main__':
    param = [
        (86, 39,),
        (81, 87,),
        (48, 84,),
        (64, 80,),
        (56, 20,),
        (5, 70,),
        (25, 13,),
        (94, 83,),
        (5, 55,),
        (46, 46,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_DIGITS_PRODUCT_TWO_NUMBERS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_DIGITS_PRODUCT_TWO_NUMBERS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_DIGITS_PRODUCT_TWO_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
