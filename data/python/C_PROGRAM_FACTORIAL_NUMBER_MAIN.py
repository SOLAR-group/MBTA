if __name__ == '__main__':
    param = [
    (84,),
    (41,),
    (5,),
    (38,),
    (79,),
    (80,),
    (64,),
    (62,),
    (24,),
    (12,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("C_PROGRAM_FACTORIAL_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("C_PROGRAM_FACTORIAL_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
