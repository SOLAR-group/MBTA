if __name__ == '__main__':
    param = [
    (8,),
    (96,),
    (96,),
    (96,),
    (12,),
    (95,),
    (72,),
    (81,),
    (42,),
    (13,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")