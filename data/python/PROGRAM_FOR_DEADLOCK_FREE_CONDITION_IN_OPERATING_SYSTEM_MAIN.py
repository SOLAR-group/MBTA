if __name__ == '__main__':
    param = [
    (38,37,),
    (82,3,),
    (2,26,),
    (38,72,),
    (31,85,),
    (80,73,),
    (11,9,),
    (2,31,),
    (26,59,),
    (37,67,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
