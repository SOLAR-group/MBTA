if __name__ == '__main__':
    param = [
    (52,),
    (93,),
    (15,),
    (72,),
    (61,),
    (21,),
    (83,),
    (87,),
    (75,),
    (75,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("DOUBLE_FACTORIAL," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("DOUBLE_FACTORIAL," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("DOUBLE_FACTORIAL," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
