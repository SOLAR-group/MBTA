if __name__ == '__main__':
    param = [
    (9,),
    (50,),
    (7,),
    (21,),
    (21,),
    (91,),
    (11,),
    (25,),
    (62,),
    (4,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_FIBONACCI_NUMBERS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_FIBONACCI_NUMBERS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_FIBONACCI_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
