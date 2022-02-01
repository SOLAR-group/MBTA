if __name__ == '__main__':
    param = [
    (44,17,10,65,),
    (33,81,67,20,),
    (39,77,21,34,),
    (52,96,23,97,),
    (64,48,17,33,),
    (45,32,89,3,),
    (53,88,24,74,),
    (86,19,29,21,),
    (57,67,30,32,),
    (11,86,96,81,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("BASIC_AND_EXTENDED_EUCLIDEAN_ALGORITHMS_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("BASIC_AND_EXTENDED_EUCLIDEAN_ALGORITHMS_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("BASIC_AND_EXTENDED_EUCLIDEAN_ALGORITHMS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
