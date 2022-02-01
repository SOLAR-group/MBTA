if __name__ == '__main__':
    param = [
    (62,),
    (13,),
    (29,),
    (72,),
    (30,),
    (20,),
    (10,),
    (47,),
    (91,),
    (52,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COMPOSITE_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COMPOSITE_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COMPOSITE_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
