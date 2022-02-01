if __name__ == '__main__':
    param = [
    (18,),
    (92,),
    (87,),
    (50,),
    (56,),
    (88,),
    (3,),
    (16,),
    (45,),
    (58,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_DECIMAL_BINARY_CONVERSION_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_DECIMAL_BINARY_CONVERSION_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_DECIMAL_BINARY_CONVERSION_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
