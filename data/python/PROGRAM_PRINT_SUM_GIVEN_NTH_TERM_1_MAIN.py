if __name__ == '__main__':
    param = [
    (42,),
    (40,),
    (67,),
    (73,),
    (18,),
    (16,),
    (74,),
    (33,),
    (92,),
    (22,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
