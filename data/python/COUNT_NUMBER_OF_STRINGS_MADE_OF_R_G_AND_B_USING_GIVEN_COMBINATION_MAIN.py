if __name__ == '__main__':
    param = [
    (90,75,22,66,),
    (32,65,5,46,),
    (94,17,44,2,),
    (50,23,92,49,),
    (16,10,72,71,),
    (37,91,7,9,),
    (75,97,38,69,),
    (88,51,32,79,),
    (27,4,20,17,),
    (67,99,53,70,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_NUMBER_OF_STRINGS_MADE_OF_R_G_AND_B_USING_GIVEN_COMBINATION," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_NUMBER_OF_STRINGS_MADE_OF_R_G_AND_B_USING_GIVEN_COMBINATION," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_NUMBER_OF_STRINGS_MADE_OF_R_G_AND_B_USING_GIVEN_COMBINATION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
