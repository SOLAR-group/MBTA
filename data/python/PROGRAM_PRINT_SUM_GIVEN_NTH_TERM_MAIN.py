if __name__ == '__main__':
    param = [
    (39,),
    (20,),
    (10,),
    (39,),
    (70,),
    (21,),
    (21,),
    (80,),
    (89,),
    (99,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_PRINT_SUM_GIVEN_NTH_TERM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
