if __name__ == '__main__':
    param = [
    (74,),
    (70,),
    (85,),
    (78,),
    (71,),
    (32,),
    (97,),
    (90,),
    (64,),
    (48,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NEXT_POWER_OF_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NEXT_POWER_OF_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NEXT_POWER_OF_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
