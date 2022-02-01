if __name__ == '__main__':
    param = [
    (0,),
    (-21,),
    (7,),
    (63,),
    (84,),
    (73,),
    (81,),
    (-10,),
    (47,),
    (23,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("DIVISIBILITY_BY_7," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("DIVISIBILITY_BY_7," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("DIVISIBILITY_BY_7," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
