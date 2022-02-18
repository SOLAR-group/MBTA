if __name__ == '__main__':
    param = [
        (38, 34,),
        (39, 29,),
        (24, 99,),
        (90, 23,),
        (44, 2,),
        (49, 70,),
        (58, 84,),
        (97, 34,),
        (99, 72,),
        (19, 67,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
