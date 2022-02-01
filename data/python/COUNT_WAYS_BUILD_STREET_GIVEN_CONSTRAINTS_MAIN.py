if __name__ == '__main__':
    param = [
    (68,),
    (91,),
    (99,),
    (79,),
    (61,),
    (48,),
    (89,),
    (20,),
    (83,),
    (1,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_WAYS_BUILD_STREET_GIVEN_CONSTRAINTS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_WAYS_BUILD_STREET_GIVEN_CONSTRAINTS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_WAYS_BUILD_STREET_GIVEN_CONSTRAINTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
