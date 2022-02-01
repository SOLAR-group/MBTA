if __name__ == '__main__':
    param = [
    (46,),
    (5,),
    (44,),
    (15,),
    (72,),
    (2,),
    (86,),
    (17,),
    (30,),
    (42,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
                print("PROBABILITY_THREE_RANDOMLY_CHOSEN_NUMBERS_AP," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROBABILITY_THREE_RANDOMLY_CHOSEN_NUMBERS_AP," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROBABILITY_THREE_RANDOMLY_CHOSEN_NUMBERS_AP," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
