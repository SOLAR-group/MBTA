if __name__ == '__main__':
    param = [
    (34,),
    (56,),
    (90,),
    (47,),
    (36,),
    (63,),
    (21,),
    (76,),
    (18,),
    (75,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CIRCLE_LATTICE_POINTS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CIRCLE_LATTICE_POINTS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CIRCLE_LATTICE_POINTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
