if __name__ == '__main__':
    param = [
    (89,),
    (11,),
    (14,),
    (92,),
    (76,),
    (63,),
    (51,),
    (16,),
    (83,),
    (66,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SQUARE_ROOT_OF_AN_INTEGER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SQUARE_ROOT_OF_AN_INTEGER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SQUARE_ROOT_OF_AN_INTEGER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
