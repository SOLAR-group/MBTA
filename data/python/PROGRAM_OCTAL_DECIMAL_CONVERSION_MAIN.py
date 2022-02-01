if __name__ == '__main__':
    param = [
    (37,),
    (25,),
    (63,),
    (66,),
    (32,),
    (5,),
    (41,),
    (82,),
    (54,),
    (5,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_OCTAL_DECIMAL_CONVERSION," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_OCTAL_DECIMAL_CONVERSION," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_OCTAL_DECIMAL_CONVERSION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
