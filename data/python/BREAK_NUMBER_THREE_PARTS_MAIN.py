if __name__ == '__main__':
    param = [
    (52,),
    (47,),
    (75,),
    (36,),
    (68,),
    (16,),
    (99,),
    (38,),
    (84,),
    (45,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("BREAK_NUMBER_THREE_PARTS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("BREAK_NUMBER_THREE_PARTS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("BREAK_NUMBER_THREE_PARTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
