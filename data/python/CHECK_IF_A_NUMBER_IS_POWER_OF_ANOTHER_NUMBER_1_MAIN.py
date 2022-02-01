if __name__ == '__main__':
    param = [
    (57,1,),
    (3,9,),
    (10,101,),
    (10,10000,),
    (6,46656,),
    (2,2048,),
    (2,40,),
    (20,79,),
    (96,98,),
    (25,5,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
