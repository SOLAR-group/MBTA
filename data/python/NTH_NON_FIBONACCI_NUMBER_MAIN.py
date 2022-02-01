if __name__ == '__main__':
    param = [
    (76,),
    (91,),
    (62,),
    (65,),
    (83,),
    (57,),
    (76,),
    (6,),
    (2,),
    (86,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NTH_NON_FIBONACCI_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NTH_NON_FIBONACCI_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NTH_NON_FIBONACCI_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
