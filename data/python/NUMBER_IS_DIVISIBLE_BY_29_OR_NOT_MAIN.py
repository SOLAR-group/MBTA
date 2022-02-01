if __name__ == '__main__':
    param = [
    (29,),
(0,),
(65,),
(1419,),
(54,),
(7,),
(44,),
(34,),
(1160,),
(292929002929,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_IS_DIVISIBLE_BY_29_OR_NOT," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_IS_DIVISIBLE_BY_29_OR_NOT," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_IS_DIVISIBLE_BY_29_OR_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
