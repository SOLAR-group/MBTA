if __name__ == '__main__':
    param = [
    (88,),
    (79,),
    (7,),
    (36,),
    (23,),
    (10,),
    (27,),
    (30,),
    (71,),
    (6,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
                print("SUM_SEQUENCE_2_22_222," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_SEQUENCE_2_22_222," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_SEQUENCE_2_22_222," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
