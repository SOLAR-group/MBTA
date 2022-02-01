if __name__ == '__main__':
    param = [
    (15,),
    (7,),
    (16,),
    (67,),
    (71,),
    (16,),
    (77,),
    (27,),
    (37,),
    (73,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("C_PROGRAM_FACTORIAL_NUMBER_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("C_PROGRAM_FACTORIAL_NUMBER_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("C_PROGRAM_FACTORIAL_NUMBER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
