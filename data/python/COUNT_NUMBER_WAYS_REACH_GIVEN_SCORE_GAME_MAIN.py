if __name__ == '__main__':
    param = [
    (83,),
    (29,),
    (17,),
    (12,),
    (93,),
    (55,),
    (97,),
    (75,),
    (22,),
    (52,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_NUMBER_WAYS_REACH_GIVEN_SCORE_GAME," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_NUMBER_WAYS_REACH_GIVEN_SCORE_GAME," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
