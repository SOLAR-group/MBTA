if __name__ == '__main__':
    param = [
    (1,),
    (92,),
    (29,),
    (52,),
    (55,),
    (13,),
    (83,),
    (83,),
    (10,),
    (67,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PADOVAN_SEQUENCE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PADOVAN_SEQUENCE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PADOVAN_SEQUENCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
