if __name__ == '__main__':
    param = [
    (57,),
    (28,),
    (23,),
    (79,),
    (52,),
    (42,),
    (79,),
    (77,),
    (99,),
    (70,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
