if __name__ == '__main__':
    param = [
    (33,),
    (72,),
    (81,),
    (93,),
    (8,),
    (76,),
    (97,),
    (91,),
    (61,),
    (6,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_TRIANGLES_N_MOVES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_TRIANGLES_N_MOVES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_TRIANGLES_N_MOVES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
