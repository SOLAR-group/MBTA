if __name__ == '__main__':
    param = [
    (24,),
    (46,),
    (47,),
    (41,),
    (98,),
    (69,),
    (83,),
    (2,),
    (12,),
    (11,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
