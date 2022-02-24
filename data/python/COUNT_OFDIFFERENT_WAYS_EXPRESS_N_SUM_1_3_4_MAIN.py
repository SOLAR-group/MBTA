if __name__ == '__main__':
    param = [
    (44,),
    (9,),
    (19,),
    (10,),
    (78,),
    (94,),
    (70,),
    (81,),
    (81,),
    (49,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_OFDIFFERENT_WAYS_EXPRESS_N_SUM_1_3_4," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_OFDIFFERENT_WAYS_EXPRESS_N_SUM_1_3_4," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
