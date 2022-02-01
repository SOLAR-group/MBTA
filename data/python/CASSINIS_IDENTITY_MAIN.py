if __name__ == '__main__':
    param = [
    (67,),
    (2,),
    (58,),
    (6,),
    (42,),
    (17,),
    (37,),
    (44,),
    (23,),
    (40,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CASSINIS_IDENTITY," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CASSINIS_IDENTITY," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CASSINIS_IDENTITY," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
