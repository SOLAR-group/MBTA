if __name__ == '__main__':
    param = [
    (18,),
    (81,),
    (77,),
    (84,),
    (87,),
    (14,),
    (15,),
    (3,),
    (21,),
    (60,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_SERIES_555555_N_TERMS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_SERIES_555555_N_TERMS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
