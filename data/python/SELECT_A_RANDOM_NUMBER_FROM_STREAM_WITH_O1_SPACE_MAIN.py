if __name__ == '__main__':
    param = [
    (64,),
    (36,),
    (21,),
    (3,),
    (18,),
    (82,),
    (76,),
    (99,),
    (70,),
    (31,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SELECT_A_RANDOM_NUMBER_FROM_STREAM_WITH_O1_SPACE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SELECT_A_RANDOM_NUMBER_FROM_STREAM_WITH_O1_SPACE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
