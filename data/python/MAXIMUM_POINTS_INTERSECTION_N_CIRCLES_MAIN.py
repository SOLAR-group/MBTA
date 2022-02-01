if __name__ == '__main__':
    param = [
    (30,),
    (25,),
    (69,),
    (39,),
    (14,),
    (60,),
    (89,),
    (27,),
    (29,),
    (29,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MAXIMUM_POINTS_INTERSECTION_N_CIRCLES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MAXIMUM_POINTS_INTERSECTION_N_CIRCLES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MAXIMUM_POINTS_INTERSECTION_N_CIRCLES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
