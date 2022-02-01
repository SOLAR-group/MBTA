if __name__ == '__main__':
    param = [
    (67,),
    (58,),
    (67,),
    (60,),
    (4,),
    (97,),
    (9,),
    (16,),
    (83,),
    (87,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_OF_TRIANGLES_IN_A_PLANE_IF_NO_MORE_THAN_TWO_POINTS_ARE_COLLINEAR," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_OF_TRIANGLES_IN_A_PLANE_IF_NO_MORE_THAN_TWO_POINTS_ARE_COLLINEAR," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_OF_TRIANGLES_IN_A_PLANE_IF_NO_MORE_THAN_TWO_POINTS_ARE_COLLINEAR," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
