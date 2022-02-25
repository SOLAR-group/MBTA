if __name__ == '__main__':
    param = [
    (1,),
    (2,),
    (3,),
    (4,),
    (5,),
    (74,),
    (77,),
    (67,),
    (9,),
    (12,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_SERIES_0_6_0_06_0_006_0_0006_N_TERMS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_SERIES_0_6_0_06_0_006_0_0006_N_TERMS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
