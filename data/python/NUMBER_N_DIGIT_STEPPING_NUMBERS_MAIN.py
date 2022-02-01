if __name__ == '__main__':
    param = [
    (18,),
    (66,),
    (73,),
    (70,),
    (26,),
    (41,),
    (20,),
    (25,),
    (52,),
    (13,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_N_DIGIT_STEPPING_NUMBERS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_N_DIGIT_STEPPING_NUMBERS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_N_DIGIT_STEPPING_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
