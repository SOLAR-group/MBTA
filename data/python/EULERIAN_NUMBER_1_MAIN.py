if __name__ == '__main__':
    param = [
    (27,7,),
    (77,34,),
    (35,22,),
    (26,20,),
    (6,10,),
    (66,47,),
    (44,29,),
    (26,33,),
    (74,86,),
    (65,97,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("EULERIAN_NUMBER_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("EULERIAN_NUMBER_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("EULERIAN_NUMBER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
