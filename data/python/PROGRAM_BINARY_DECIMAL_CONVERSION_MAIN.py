if __name__ == '__main__':
    param = [
    (70,),
    (95,),
    (41,),
    (97,),
    (8,),
    (16,),
    (41,),
    (57,),
    (81,),
    (78,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_BINARY_DECIMAL_CONVERSION," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_BINARY_DECIMAL_CONVERSION," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_BINARY_DECIMAL_CONVERSION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
