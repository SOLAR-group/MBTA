if __name__ == '__main__':
    param = [
    (95,),
    (49,),
    (10,),
    (73,),
    (74,),
    (40,),
    (10,),
    (94,),
    (64,),
    (16,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MAXIMUM_NUMBER_2X2_SQUARES_CAN_FIT_INSIDE_RIGHT_ISOSCELES_TRIANGLE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MAXIMUM_NUMBER_2X2_SQUARES_CAN_FIT_INSIDE_RIGHT_ISOSCELES_TRIANGLE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MAXIMUM_NUMBER_2X2_SQUARES_CAN_FIT_INSIDE_RIGHT_ISOSCELES_TRIANGLE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
