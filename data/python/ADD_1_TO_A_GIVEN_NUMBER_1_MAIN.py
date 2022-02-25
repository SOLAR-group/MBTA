if __name__ == '__main__':
    param = [
    (20,),
    (68,),
    (52,),
    (61,),
    (3,),
    (88,),
    (41,),
    (78,),
    (94,),
    (18,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("ADD_1_TO_A_GIVEN_NUMBER_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("ADD_1_TO_A_GIVEN_NUMBER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
