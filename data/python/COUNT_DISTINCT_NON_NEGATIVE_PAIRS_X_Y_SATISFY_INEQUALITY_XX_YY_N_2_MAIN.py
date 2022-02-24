if __name__ == '__main__':
    param = [
    (61,),
    (45,),
    (53,),
    (4,),
    (82,),
    (86,),
    (37,),
    (48,),
    (81,),
    (50,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_DISTINCT_NON_NEGATIVE_PAIRS_X_Y_SATISFY_INEQUALITY_XX_YY_N_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_DISTINCT_NON_NEGATIVE_PAIRS_X_Y_SATISFY_INEQUALITY_XX_YY_N_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
