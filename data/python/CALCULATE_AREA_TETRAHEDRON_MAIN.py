if __name__ == '__main__':
    param = [
    (58,),
    (56,),
    (35,),
    (99,),
    (13,),
    (45,),
    (40,),
    (92,),
    (7,),
    (13,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
                print("CALCULATE_AREA_TETRAHEDRON," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CALCULATE_AREA_TETRAHEDRON," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CALCULATE_AREA_TETRAHEDRON," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
