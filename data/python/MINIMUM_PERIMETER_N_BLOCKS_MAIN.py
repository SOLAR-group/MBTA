if __name__ == '__main__':
    param = [
    (45,),
    (80,),
    (54,),
    (48,),
    (83,),
    (68,),
    (32,),
    (20,),
    (68,),
    (66,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MINIMUM_PERIMETER_N_BLOCKS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MINIMUM_PERIMETER_N_BLOCKS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MINIMUM_PERIMETER_N_BLOCKS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
