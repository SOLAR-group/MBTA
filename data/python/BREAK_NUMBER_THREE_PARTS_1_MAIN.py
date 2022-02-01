if __name__ == '__main__':
    param = [
    (71,),
    (71,),
    (36,),
    (3,),
    (97,),
    (69,),
    (15,),
    (48,),
    (77,),
    (6,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("BREAK_NUMBER_THREE_PARTS_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("BREAK_NUMBER_THREE_PARTS_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("BREAK_NUMBER_THREE_PARTS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
