if __name__ == '__main__':
    param = [
    (49,30,),
    (80,25,),
    (10,9,),
    (81,57,),
    (11,4,),
    (45,34,),
    (86,90,),
    (27,78,),
    (80,60,),
    (97,31,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FINDING_POWER_PRIME_NUMBER_P_N," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FINDING_POWER_PRIME_NUMBER_P_N," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
