if __name__ == '__main__':
    param = [
    (72,),
    (28,),
    (45,),
    (41,),
    (94,),
    (97,),
    (97,),
    (36,),
    (91,),
    (84,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("HYPERCUBE_GRAPH," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("HYPERCUBE_GRAPH," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("HYPERCUBE_GRAPH," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
