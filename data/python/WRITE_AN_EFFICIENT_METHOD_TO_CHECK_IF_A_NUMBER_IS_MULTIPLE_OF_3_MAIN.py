if __name__ == '__main__':
    param = [
    (94,),
    (94,),
    (79,),
    (39,),
    (16,),
    (90,),
    (64,),
    (76,),
    (83,),
    (47,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("WRITE_AN_EFFICIENT_METHOD_TO_CHECK_IF_A_NUMBER_IS_MULTIPLE_OF_3," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("WRITE_AN_EFFICIENT_METHOD_TO_CHECK_IF_A_NUMBER_IS_MULTIPLE_OF_3," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
