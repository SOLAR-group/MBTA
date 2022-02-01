if __name__ == '__main__':
    param = [
    (27,),
    (64,),
    (93,),
    (90,),
    (85,),
    (86,),
    (72,),
    (86,),
    (32,),
    (1,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("UGLY_NUMBERS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("UGLY_NUMBERS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("UGLY_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
