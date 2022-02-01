if __name__ == '__main__':
    param = [
    (67,),
    (89,),
    (12,),
    (94,),
    (96,),
    (25,),
    (49,),
    (8,),
    (33,),
    (59,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("EVEN_FIBONACCI_NUMBERS_SUM," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("EVEN_FIBONACCI_NUMBERS_SUM," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("EVEN_FIBONACCI_NUMBERS_SUM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
