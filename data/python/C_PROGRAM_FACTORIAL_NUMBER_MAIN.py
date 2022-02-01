if __name__ == '__main__':
    param = [
    (84,),
    (41,),
    (5,),
    (38,),
    (79,),
    (80,),
    (64,),
    (62,),
    (24,),
    (12,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("C_PROGRAM_FACTORIAL_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("C_PROGRAM_FACTORIAL_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("C_PROGRAM_FACTORIAL_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
