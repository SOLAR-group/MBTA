if __name__ == '__main__':
    param = [
    (37,80,),
    (10000000000,-10000000000,),
    (10000000000,10000000000,),
    (999999999,999999999,),
    (39,36,),
    (92,56,),
    (14,21,),
    (19,38,),
    (14,82,),
    (88,41,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHECK_INTEGER_OVERFLOW_MULTIPLICATION," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_INTEGER_OVERFLOW_MULTIPLICATION," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_INTEGER_OVERFLOW_MULTIPLICATION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
