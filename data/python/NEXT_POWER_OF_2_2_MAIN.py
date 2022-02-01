if __name__ == '__main__':
    param = [
    (63,),
    (78,),
    (13,),
    (5,),
    (34,),
    (69,),
    (63,),
    (78,),
    (80,),
    (19,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NEXT_POWER_OF_2_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NEXT_POWER_OF_2_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NEXT_POWER_OF_2_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
