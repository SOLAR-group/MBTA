if __name__ == '__main__':
    param = [
    (76,43,),
    (77,91,),
    (9,42,),
    (59,67,),
    (8,52,),
    (97,8,),
    (78,24,),
    (41,88,),
    (72,61,),
    (71,28,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FINDING_POWER_PRIME_NUMBER_P_N_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FINDING_POWER_PRIME_NUMBER_P_N_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
