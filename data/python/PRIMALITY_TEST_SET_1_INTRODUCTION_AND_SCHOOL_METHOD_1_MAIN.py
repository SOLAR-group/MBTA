if __name__ == '__main__':
    param = [
        (15,),
        (90,),
        (38,),
        (65,),
        (91,),
        (16,),
        (48,),
        (74,),
        (14,),
        (47,)
    ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PRIMALITY_TEST_SET_1_INTRODUCTION_AND_SCHOOL_METHOD_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PRIMALITY_TEST_SET_1_INTRODUCTION_AND_SCHOOL_METHOD_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
