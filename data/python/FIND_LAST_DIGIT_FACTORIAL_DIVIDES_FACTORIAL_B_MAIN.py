if __name__ == '__main__':
    param = [
    (79,84,),
    (61,29,),
    (39,77,),
    (39,65,),
    (61,78,),
    (86,73,),
    (7,92,),
    (86,50,),
    (86,63,),
    (11,2,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_LAST_DIGIT_FACTORIAL_DIVIDES_FACTORIAL_B," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_LAST_DIGIT_FACTORIAL_DIVIDES_FACTORIAL_B," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_LAST_DIGIT_FACTORIAL_DIVIDES_FACTORIAL_B," + sys.argv[1] + "," + str(i) + ",EXCEPTION")