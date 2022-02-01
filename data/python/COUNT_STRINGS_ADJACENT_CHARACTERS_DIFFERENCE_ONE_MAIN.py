if __name__ == '__main__':
    param = [
    (7,),
    (47,),
    (72,),
    (66,),
    (71,),
    (56,),
    (61,),
    (68,),
    (78,),
    (22,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_STRINGS_ADJACENT_CHARACTERS_DIFFERENCE_ONE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_STRINGS_ADJACENT_CHARACTERS_DIFFERENCE_ONE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_STRINGS_ADJACENT_CHARACTERS_DIFFERENCE_ONE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
