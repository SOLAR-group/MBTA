if __name__ == '__main__':
    param = [
    (1,),
    (5,),
    (14,),
    (140,),
    (204,),
    (3,),
    (506,),
    (42,),
    (4,),
    (87,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SQUARE_PYRAMIDAL_NUMBER_SUM_SQUARES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SQUARE_PYRAMIDAL_NUMBER_SUM_SQUARES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SQUARE_PYRAMIDAL_NUMBER_SUM_SQUARES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
