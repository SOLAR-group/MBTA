if __name__ == '__main__':
    param = [
    (94,4,69,),
    (7,12,33,),
    (20,44,24,),
    (90,94,88,),
    (50,58,27,),
    (32,90,29,),
    (46,25,6,),
    (82,50,87,),
    (43,82,70,),
    (6,83,19,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("DICE_THROW_PROBLEM," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("DICE_THROW_PROBLEM," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("DICE_THROW_PROBLEM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
