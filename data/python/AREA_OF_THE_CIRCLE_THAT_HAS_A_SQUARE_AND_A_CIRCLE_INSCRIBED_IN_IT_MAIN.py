if __name__ == '__main__':
    param = [
    (77,),
    (18,),
    (83,),
    (39,),
    (68,),
    (28,),
    (71,),
    (14,),
    (21,),
    (73,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
                print("AREA_OF_THE_CIRCLE_THAT_HAS_A_SQUARE_AND_A_CIRCLE_INSCRIBED_IN_IT," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("AREA_OF_THE_CIRCLE_THAT_HAS_A_SQUARE_AND_A_CIRCLE_INSCRIBED_IN_IT," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("AREA_OF_THE_CIRCLE_THAT_HAS_A_SQUARE_AND_A_CIRCLE_INSCRIBED_IN_IT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
