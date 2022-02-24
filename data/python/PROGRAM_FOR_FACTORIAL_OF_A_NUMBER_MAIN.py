if __name__ == '__main__':
    param = [
    (79,),
    (95,),
    (84,),
    (12,),
    (72,),
    (67,),
    (82,),
    (14,),
    (2,),
    (69,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_FOR_FACTORIAL_OF_A_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
