if __name__ == '__main__':
    param = [
    (6,30,),
    (23,87,),
    (89,31,),
    (63,36,),
    (23,68,),
    (44,66,),
    (81,18,),
    (43,73,),
    (9,42,),
    (41,98,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PAINTING_FENCE_ALGORITHM," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PAINTING_FENCE_ALGORITHM," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PAINTING_FENCE_ALGORITHM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")