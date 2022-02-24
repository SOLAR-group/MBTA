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
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
