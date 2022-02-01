if __name__ == '__main__':
    param = [
    (57,),
    (28,),
    (23,),
    (79,),
    (52,),
    (42,),
    (79,),
    (77,),
    (99,),
    (70,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
