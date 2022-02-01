if __name__ == '__main__':
    param = [
    (93,),
    (83,),
    (51,),
    (77,),
    (13,),
    (34,),
    (49,),
    (12,),
    (68,),
    (80,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
                print("C_PROGRAM_FIND_AREA_CIRCLE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("C_PROGRAM_FIND_AREA_CIRCLE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("C_PROGRAM_FIND_AREA_CIRCLE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
