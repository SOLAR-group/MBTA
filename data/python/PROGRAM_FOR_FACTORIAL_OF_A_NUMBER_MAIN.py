if __name__ == '__main__':
    param = [
    (79,),
    (95,),
    (84,),
    (12,),
    (72,),
    (67,),
    (82,),
    (14,),
    (2,),
    (69,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
