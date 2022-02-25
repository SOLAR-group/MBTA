if __name__ == '__main__':
    param = [
    (73,75,),
    (70,5,),
    (53,62,),
    (80,70,),
    (9,59,),
    (38,48,),
    (41,49,),
    (80,72,),
    (42,52,),
    (54,1,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_POSSIBLE_PATHS_TOP_LEFT_BOTTOM_RIGHT_NXM_MATRIX_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_POSSIBLE_PATHS_TOP_LEFT_BOTTOM_RIGHT_NXM_MATRIX_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
