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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PRIMALITY_TEST_SET_1_INTRODUCTION_AND_SCHOOL_METHOD," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PRIMALITY_TEST_SET_1_INTRODUCTION_AND_SCHOOL_METHOD," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PRIMALITY_TEST_SET_1_INTRODUCTION_AND_SCHOOL_METHOD," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
