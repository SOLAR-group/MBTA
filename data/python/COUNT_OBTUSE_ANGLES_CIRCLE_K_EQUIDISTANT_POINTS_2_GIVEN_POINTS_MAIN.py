if __name__ == '__main__':
    param = [
    (83,98,86,),
    (3,39,87,),
    (11,96,30,),
    (50,67,48,),
    (40,16,32,),
    (62,86,76,),
    (40,78,71,),
    (66,11,74,),
    (6,9,19,),
    (25,5,5,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_OBTUSE_ANGLES_CIRCLE_K_EQUIDISTANT_POINTS_2_GIVEN_POINTS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_OBTUSE_ANGLES_CIRCLE_K_EQUIDISTANT_POINTS_2_GIVEN_POINTS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_OBTUSE_ANGLES_CIRCLE_K_EQUIDISTANT_POINTS_2_GIVEN_POINTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
