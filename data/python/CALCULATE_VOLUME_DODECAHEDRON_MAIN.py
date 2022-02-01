if __name__ == '__main__':
    param = [
    (56,),
    (73,),
    (22,),
    (10,),
    (84,),
    (20,),
    (51,),
    (91,),
    (10,),
    (83,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
                print("CALCULATE_VOLUME_DODECAHEDRON," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CALCULATE_VOLUME_DODECAHEDRON," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CALCULATE_VOLUME_DODECAHEDRON," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
