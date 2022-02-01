if __name__ == '__main__':
    param = [
    (57,5,33,),
    (58,45,4,),
    (38,89,9,),
    (5,39,30,),
    (91,90,47,),
    (76,56,46,),
    (38,43,84,),
    (97,26,52,),
    (97,90,90,),
    (99,2,26,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("DICE_THROW_PROBLEM_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("DICE_THROW_PROBLEM_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("DICE_THROW_PROBLEM_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
