if __name__ == '__main__':
    param = [
        (11, 36, 62, 64, 50, 4,),
        (87, 1, 62, 64, 54, 41,),
        (51, 1, 47, 90, 14, 71,),
        (89, 67, 9, 52, 94, 21,),
        (64, 10, 79, 45, 67, 78,),
        (57, 86, 99, 43, 83, 63,),
        (65, 90, 42, 82, 77, 32,),
        (32, 23, 28, 26, 60, 45,),
        (73, 61, 63, 77, 92, 76,),
        (3, 99, 6, 19, 21, 28,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
