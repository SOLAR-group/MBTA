if __name__ == '__main__':
    param = [
    (474,),
    (9445,),
    (90,),
    (30,),
    (37453,),
    (27,),
    (2400,),
    (98,),
    (46,),
    (722,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_TO_CHECK_IF_A_GIVEN_NUMBER_IS_LUCKY_ALL_DIGITS_ARE_DIFFERENT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_TO_CHECK_IF_A_GIVEN_NUMBER_IS_LUCKY_ALL_DIGITS_ARE_DIFFERENT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
