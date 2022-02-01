if __name__ == '__main__':
    param = [
    (35,8,77,),
    (85,55,33,),
    (22,23,64,),
    (8,43,29,),
    (12,64,11,),
    (58,25,26,),
    (65,4,28,),
    (10,95,55,),
    (23,13,54,),
    (5,50,71,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_JUMP_REQUIRED_GIVEN_LENGTH_REACH_POINT_FORM_D_0_ORIGIN_2D_PLANE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_JUMP_REQUIRED_GIVEN_LENGTH_REACH_POINT_FORM_D_0_ORIGIN_2D_PLANE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_JUMP_REQUIRED_GIVEN_LENGTH_REACH_POINT_FORM_D_0_ORIGIN_2D_PLANE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
