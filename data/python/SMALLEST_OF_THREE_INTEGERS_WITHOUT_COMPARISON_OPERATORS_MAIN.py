if __name__ == '__main__':
    param = [
    (23,98,25,),
    (87,55,94,),
    (35,90,29,),
    (25,9,41,),
    (93,22,39,),
    (52,42,96,),
    (95,88,26,),
    (91,64,51,),
    (75,1,6,),
    (96,44,76,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
