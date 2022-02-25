if __name__ == '__main__':
    param = [
    (37,),
    (82,),
    (87,),
    (80,),
    (92,),
    (58,),
    (98,),
    (53,),
    (11,),
    (58,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_NUMBER_OF_WAYS_TO_COVER_A_DISTANCE_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_NUMBER_OF_WAYS_TO_COVER_A_DISTANCE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
