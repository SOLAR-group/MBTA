if __name__ == '__main__':
    param = [
    (10,4,),
    (5,2,),
    (2,8,),
    (83,7,),
    (91,0,),
    (18,53,),
    (83,41,),
    (98,53,),
    (43,37,),
    (31,20,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
