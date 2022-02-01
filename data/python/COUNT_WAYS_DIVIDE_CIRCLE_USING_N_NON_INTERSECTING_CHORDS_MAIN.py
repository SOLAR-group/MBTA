if __name__ == '__main__':
    param = [
    (32,),
    (52,),
    (52,),
    (32,),
    (73,),
    (31,),
    (29,),
    (75,),
    (39,),
    (49,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_WAYS_DIVIDE_CIRCLE_USING_N_NON_INTERSECTING_CHORDS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_WAYS_DIVIDE_CIRCLE_USING_N_NON_INTERSECTING_CHORDS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_WAYS_DIVIDE_CIRCLE_USING_N_NON_INTERSECTING_CHORDS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
