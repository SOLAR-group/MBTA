if __name__ == '__main__':
    param = [
    (32,),
    (52,),
    (52,),
    (32,),
    (73,),
    (31,),
    (29,),
    (75,),
    (39,),
    (49,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_WAYS_DIVIDE_CIRCLE_USING_N_NON_INTERSECTING_CHORDS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_WAYS_DIVIDE_CIRCLE_USING_N_NON_INTERSECTING_CHORDS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
