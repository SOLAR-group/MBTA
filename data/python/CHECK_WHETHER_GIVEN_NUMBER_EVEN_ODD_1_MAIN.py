if __name__ == '__main__':
    param = [
    (57,),
    (73,),
    (79,),
    (36,),
    (71,),
    (23,),
    (41,),
    (66,),
    (46,),
    (50,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
