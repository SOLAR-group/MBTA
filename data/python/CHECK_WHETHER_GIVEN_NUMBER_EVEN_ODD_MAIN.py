if __name__ == '__main__':
    param = [
    (67,),
    (90,),
    (55,),
    (90,),
    (83,),
    (32,),
    (58,),
    (38,),
    (87,),
    (87,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
