if __name__ == '__main__':
    param = [
    (66,),
    (93,),
    (39,),
    (93,),
    (68,),
    (20,),
    (37,),
    (52,),
    (52,),
    (19,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("C_PROGRAM_FACTORIAL_NUMBER_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("C_PROGRAM_FACTORIAL_NUMBER_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("C_PROGRAM_FACTORIAL_NUMBER_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
