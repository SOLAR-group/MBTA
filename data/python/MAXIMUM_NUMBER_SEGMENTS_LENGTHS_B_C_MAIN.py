if __name__ == '__main__':
    param = [
    (23,16,23,18,),
    (62,76,81,97,),
    (32,46,1,78,),
    (82,48,72,58,),
    (94,99,62,38,),
    (44,21,46,60,),
    (4,57,2,77,),
    (53,23,80,5,),
    (9,55,26,85,),
    (23,15,73,42,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C," + sys.argv[1] + "," + str(i) + ",EXCEPTION")