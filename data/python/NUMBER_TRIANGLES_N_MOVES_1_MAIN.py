if __name__ == '__main__':
    param = [
    (78,),
    (89,),
    (46,),
    (56,),
    (79,),
    (71,),
    (80,),
    (77,),
    (48,),
    (16,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
                print("NUMBER_TRIANGLES_N_MOVES_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_TRIANGLES_N_MOVES_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_TRIANGLES_N_MOVES_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
