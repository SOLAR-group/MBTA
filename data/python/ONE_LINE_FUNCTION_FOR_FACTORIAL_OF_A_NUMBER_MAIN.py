if __name__ == '__main__':
    param = [
    (58,),
    (42,),
    (76,),
    (16,),
    (49,),
    (60,),
    (99,),
    (45,),
    (6,),
    (70,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("ONE_LINE_FUNCTION_FOR_FACTORIAL_OF_A_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("ONE_LINE_FUNCTION_FOR_FACTORIAL_OF_A_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
