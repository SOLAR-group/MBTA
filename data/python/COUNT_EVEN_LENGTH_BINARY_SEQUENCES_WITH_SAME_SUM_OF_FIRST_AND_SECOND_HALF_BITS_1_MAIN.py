if __name__ == '__main__':
    param = [
    (52,),
    (75,),
    (25,),
    (80,),
    (18,),
    (17,),
    (33,),
    (8,),
    (99,),
    (8,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_EVEN_LENGTH_BINARY_SEQUENCES_WITH_SAME_SUM_OF_FIRST_AND_SECOND_HALF_BITS_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_EVEN_LENGTH_BINARY_SEQUENCES_WITH_SAME_SUM_OF_FIRST_AND_SECOND_HALF_BITS_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_EVEN_LENGTH_BINARY_SEQUENCES_WITH_SAME_SUM_OF_FIRST_AND_SECOND_HALF_BITS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
