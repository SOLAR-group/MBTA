if __name__ == '__main__':
    param = [
    (8,),
    (79,),
    (31,),
    (63,),
    (18,),
    (2,),
    (6,),
    (85,),
    (29,),
    (8,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NEXT_POWER_OF_2_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NEXT_POWER_OF_2_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NEXT_POWER_OF_2_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
