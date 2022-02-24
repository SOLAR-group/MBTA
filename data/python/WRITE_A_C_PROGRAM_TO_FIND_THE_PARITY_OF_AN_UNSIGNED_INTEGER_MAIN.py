if __name__ == '__main__':
    param = [
    (63,),
    (64,),
    (85,),
    (36,),
    (20,),
    (63,),
    (42,),
    (19,),
    (62,),
    (97,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("WRITE_A_C_PROGRAM_TO_FIND_THE_PARITY_OF_AN_UNSIGNED_INTEGER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("WRITE_A_C_PROGRAM_TO_FIND_THE_PARITY_OF_AN_UNSIGNED_INTEGER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
