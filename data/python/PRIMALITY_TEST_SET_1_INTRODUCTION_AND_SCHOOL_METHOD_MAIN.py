if __name__ == '__main__':
    param = [
    (37,),
    (39,),
    (73,),
    (8,),
    (28,),
    (66,),
    (20,),
    (36,),
    (6,),
    (51,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PRIMALITY_TEST_SET_1_INTRODUCTION_AND_SCHOOL_METHOD," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PRIMALITY_TEST_SET_1_INTRODUCTION_AND_SCHOOL_METHOD," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
