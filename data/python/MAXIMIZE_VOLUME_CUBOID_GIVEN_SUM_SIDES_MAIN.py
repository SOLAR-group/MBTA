if __name__ == '__main__':
    param = [
        (67,),
        (48,),
        (59,),
        (22,),
        (14,),
        (66,),
        (1,),
        (75,),
        (58,),
        (78,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
