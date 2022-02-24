if __name__ == '__main__':
    param = [
    (371,),
    (9474,),
    (85,),
    (35,),
    (54,),
    (17,),
    (97,),
    (63,),
    (12,),
    (43,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_CHECK_PLUS_PERFECT_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_CHECK_PLUS_PERFECT_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
