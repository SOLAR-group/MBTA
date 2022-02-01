if __name__ == '__main__':
    param = [
    (40,74,),
    (38,35,),
    (47,71,),
    (52,29,),
    (21,9,),
    (50,33,),
    (8,82,),
    (56,80,),
    (93,5,),
    (21,90,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
