if __name__ == '__main__':
    param = [
    (51,),
    (40,),
    (68,),
    (7,),
    (8,),
    (32,),
    (93,),
    (75,),
    (71,),
    (15,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIBONACCI_MODULO_P," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIBONACCI_MODULO_P," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIBONACCI_MODULO_P," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
