if __name__ == '__main__':
    param = [
    (96,),
    (66,),
    (67,),
    (13,),
    (75,),
    (78,),
    (1,),
    (83,),
    (27,),
    (65,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("ADD_1_TO_A_GIVEN_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("ADD_1_TO_A_GIVEN_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
